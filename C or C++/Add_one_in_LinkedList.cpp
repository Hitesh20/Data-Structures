
#include <bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node* next;
};
Node* addOne(Node *head);
Node* newNode(int key)
{
    Node *temp = new Node;
    temp->data = key;
    temp->next = NULL;
    return temp;
}
Node *ZZZZZZZZZZ(Node *head)
{
    Node * prev   = NULL;
    Node * current = head;
    Node * next;
    while (current != NULL)
    {
        next  = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    return prev;
}
void print(struct Node *head)
{
	Node *temp=head;
	while(temp!=NULL)
	{
		cout<<temp->data;
		temp=temp->next;
	}
}
// This function mainly uses addOneUtil().
int main() {
	// your code goes here
	int T;
	cin>>T;
	int no;
	while(T--)
	{
		struct Node *head = NULL;
        struct Node *temp = head;
        
		cin>>no;
		while(no!=0)
			{
			if(head==NULL)
			head=temp=newNode(no%10);
			else
			{
				temp->next = newNode(no%10);
				temp=temp->next;
			}
			no/=10;
		}
		head = ZZZZZZZZZZ(head);
		
		head=addOne(head);
		print(head);
		cout<<endl;
	}
	return 0;
}

/*This is a function problem.You only need to complete the function given below*/
/* Node structure
struct Node
{
    int data;
    Node* next;
}; */
// Should rearrange given linked list such that all even
// positioned Nodes are before odd positioned.
// Returns new head of linked List.
Node *reverse(Node *head)
{
    Node *curr,*prev=NULL,*forward;
    curr = head;
    while(curr->next!=NULL)
    {
        forward = curr->next;
        curr->next = prev;
        prev = curr;
        curr = forward;
    }
    curr->next = prev;
    head = curr;
    return head;
}

Node *addOne(Node *head)
{
    Node *curr;
    int carry = 0;
   head = reverse(head);
   curr = head;
   while(curr->next!=NULL)
   {
       if(curr == head)
       {
           curr->data += 1;
       }
       curr->data += carry;
       if(curr->data>9)
       {
           curr->data = 0;
           carry = 1;
       }
       else
       {
           carry = 0;
       }
       curr = curr->next;
   }
   if(carry)
   {
       curr->data += carry;
        if(curr->data>9)
        {
             curr->data = 0;
            carry = 1;
        }
       Node *extra = newNode(carry%10);
       curr->next = extra;
       head = reverse(head);
       return head;
   }
   else
   {
       head = reverse(head);
       return head;
   }
   
}

