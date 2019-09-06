#include <bits/stdc++.h>
using namespace std;
struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};
void print(Node *root)
{
Node *temp = root;
while(temp!=NULL)
{
cout<<temp->data<<" ";
temp=temp->next;
}
}
Node* removeDuplicates(Node *root);
int main() {
	// your code goes here
	int T;
	cin>>T;
	while(T--)
	{
		int K;
		cin>>K;
		Node *head = NULL;
                Node *temp = head;
		for(int i=0;i<K;i++){
		int data;
		cin>>data;
			if(head==NULL)
			head=temp=new Node(data);
			else
			{
				temp->next = new Node(data);
				temp=temp->next;
			}
		}
		Node *result  = removeDuplicates(head);
		print(result);
		cout<<endl;
	}
	return 0;
}

/*This is a function problem.You only need to complete the function given below*/
/*
struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};*/
// root: head node
Node *removeDuplicates(Node *root)
{
 Node *curr,*prev,*curr2;
 curr = root;
 while(curr->next!=NULL)
 {
     curr2 = curr->next;
     while(curr2->next !=NULL)
     {
         if(curr->data==curr2->data)
         {
             curr->next = curr2->next;
             free(curr2);
         }
         curr2 = curr2->next;
     }
     if(curr2->data == curr->data && curr2->next==NULL)
     {
         curr->next = NULL;
     }
     if(curr->next !=NULL && curr!=NULL)
     {
        curr = curr->next;
     }
 }
 return root;
}

