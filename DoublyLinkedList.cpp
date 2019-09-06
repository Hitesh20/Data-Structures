#include<stdio.h>
#include<malloc.h>

struct Node
{
	int data;
	struct Node *prev, *next;
} *start = NULL, *tail = NULL;


void insertAtFirst(int item)
{
	struct Node *n;
	n = (struct Node *)malloc(sizeof(Node));
	n->data = item;
	n->prev = NULL;
	n->next = NULL;
	if(start == NULL)
	{
		start = n;
		tail = n;
	}
	else
	{
		start->prev = n;
		n->next = start;
		start = n;
	}
}
void insertAtLast(int item)
{
	struct Node *n;
	n = (struct Node *)malloc(sizeof(Node));
	n->data = item;
	n->prev = NULL;
	n->next =NULL;
	if(start == NULL)
	{
		start = n;
		tail = n;
	}
	else
	{
		struct Node *curr;
		curr = start;
		while(curr->next != NULL)
		{
			curr = curr->next;
		}
		curr->next = n;
		n->prev = curr;
		tail = n;
	}
	 
}
void insertAtPosition(int pos,int item)
{
	struct Node *n,*curr,*back;
	n = (struct Node *)malloc(sizeof(Node));
	n->data = item;
	n->prev = NULL;
	n->next =NULL;
	int counter;
	curr=start;
	for(counter=0; counter< pos-1;counter++)
	{
		back = curr;
		curr=curr->next;
	}
	if(counter==0)
	{
		insertAtFirst(item);
	}
	else if(curr == tail)
	{
		insertAtLast(item);
	}
	else
	{
		n->next = curr;
		n->prev = back;
		curr->prev = n;
		back->next = n;
	}
}
void removeFirst()
{
	if(start==NULL)
	{
		printf("List is Empty");
	}
	else
	{
		struct Node *curr;
		curr = start;
		start = curr->next;
		start->prev = NULL;
		free(curr);
	}
}
void removeLast()
{
	struct Node *temp;
	if(start==NULL)
	{
		printf("List is Empty");
	}
	else
	{
		temp = tail->prev;
		temp->next = NULL;
		free(tail);
		tail = temp;
	}
	

}
void reverse()
{
	struct Node *temp;
	temp = start;
	start = tail;
	tail = start;
}
void print()
{
	struct Node *curr;
	curr = start;
	if(start == NULL)
	{
		printf("List is empty");
	}
	else
	{
		while(curr->next!=NULL)
		{
			printf("%d, ",curr->data);
			curr = curr->next;
		}
		printf("%d",curr->data);
	}	
}

int main()
{
	int choice,item,index,pos;
	bool flag = true;
	while(flag)
	{
		printf("\n1. Insert At Last");
		printf("\n2. Insert At Start");
		printf("\n3. Insert At a particular Position");          //check this
		printf("\n4. Remove Last");
		printf("\n5. Remove First");
		printf("\n6. Remove At a particular Index");
		printf("\n7. Reverse");
		printf("\n8. Print");
		printf("\n9. Delete With Value");
		printf("\n10. Exit");
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
				scanf("%d",&pos);
				scanf("%d",&item);
				insertAtPosition(pos,item);
				break;
			case 4:
				removeLast();
				break;
			case 5:
				removeFirst();
				break;
			case 6:
				scanf("%d",&index);
				//removeAtIndex(index);
				break;
			case 7:
				reverse();
				break;
			case 8:
				print();
				break;
			case 9:
				scanf("%d",&item);
				//deleteValue(item);
				break;
			case 10:
				flag = false;
				break;
		}
	}	
	return 0;

}
