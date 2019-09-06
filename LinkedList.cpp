#include<stdio.h>
#include<malloc.h>

struct Node
{
	int data;
	struct Node *link;
};

struct Node *head = NULL;

struct Node* createNode()
{
	struct Node *n;
	n = (struct Node*)malloc(sizeof(struct Node));
	return n;
}
void insertAtLast(int item)
{
	struct Node *node,*curr;
	node = createNode();
	node->data = item;
	node->link = NULL;
	if(head==NULL)
	{
		head = node;
	}
	else
	{
		curr = head;
		while(curr->link != NULL)
		{
			curr = curr->link;
		}
		curr->link = node;	
	}	
}
void insertAtFirst(int item)
{
	struct Node *node;
	node = createNode();
	node->data = item;
	node->link = head;
	head = node;
}
void insertAtIndex(int index,int item)
{
	struct Node *node,*curr,*prev;
	node = createNode();
	node->data = item;
	if(index==0)
	{
		node->link = head;
		head = node;
	}
	else
	{
		curr = head;
		for(int i=0;i<index;i++)
		{
			prev = curr;
			curr = curr->link;
		}
		prev->link = node;
		node->link = curr;
	}
}
void print()
{
	struct Node *curr;
	curr = head;
	while(curr->link != NULL)
	{
		printf("%d, ",curr->data);
		curr = curr->link;
	}
	printf("%d",curr->data);
}
bool removeAtIndex(int index)
{
	struct Node *temp,*curr,*prev;
	curr = head;
	int count = 0;
	if(index==0)
	{
		temp = curr->link;
		temp = NULL;
		curr = curr->link;
		head = curr;
		return true;
	}
	else
	{		
		for(int i=0;i<index;i++)
		{
			prev = curr;
			curr = curr->link;
		}
		temp = curr->link;
		prev->link = temp;
		curr = NULL;
		return true;
	}
}
bool removeLast()
{
	struct Node *curr,*prev;
	curr = head;
	while(curr->link != NULL)
	{
		prev= curr;
		curr = curr->link;
	}
	prev->link = NULL;
	curr = NULL;
	return true;
}
void removeFirst()
{
	removeAtIndex(0);
}
void reverse()
{
	struct Node *curr,*prev=NULL,*next;
	curr = head;
	while(curr->link != NULL)
	{
		next = curr->link;
		curr->link =  prev;
		prev = curr;
		curr = next; 
	}
	curr->link = prev;
	head = curr;
}
void deleteValue(int item)
{
	struct Node *curr;
	curr = head;
	int count=0;
	while(curr->link != NULL)
	{
		if(curr->data == item)
		{
			removeAtIndex(count);
			count--;
		}
		count++;
		curr = curr->link;
	}
	if(curr->data == item)
	{
		removeAtIndex(count);
	}
}

void findMiddle()
{
	struct Node *slowPtr=head, *fastPtr=head;
	if(head!=NULL)
	{
		while(fastPtr != NULL && fastPtr->link != NULL)
		{
			fastPtr = fastPtr->link->link;
			slowPtr = slowPtr->link;
		}
		printf("Middle element is : %d\n",slowPtr->data);
	}
	else
	{
		printf("List is Empty");
	}
}

int main()
{
	int choice,item,index;
	bool flag = true;
	while(flag)
	{
		printf("\n1. Insert At Last");
		printf("\n2. Insert At Start");
		printf("\n3. Insert At a particular Index");
		printf("\n4. Remove Last");
		printf("\n5. Remove First");
		printf("\n6. Remove At a particular Index");
		printf("\n7. Reverse");
		printf("\n8. Print");
		printf("\n9. Delete With Value");
		printf("\n10. Find middle element");
		printf("\n11. Exit");
		printf("\nEnter Your Choice");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				scanf("%d",&item);
				insertAtLast(item);
				break;
			case 2:
				scanf("%d",&item);
				insertAtFirst(item);
				break;
			case 3:
				scanf("%d",&index);
				scanf("%d",&item);
				insertAtIndex(index,item);
				break;
			case 4:
				removeLast();
				break;
			case 5:
				removeFirst();
				break;
			case 6:
				scanf("%d",&index);
				removeAtIndex(index);
				break;
			case 7:
				reverse();
				break;
			case 8:
				print();
				break;
			case 9:
				scanf("%d",&item);
				deleteValue(item);
				break;
			case 10:
				findMiddle();
				break;	
			case 11:
				flag = false;
				break;
		}
	}	
	return 0;
}









