#include<stdio.h>
#include <stdlib.h>
#include<malloc.h>
struct Node
{
	int data;
	struct Node *right;
	struct Node *down;
};

struct Node *head = NULL;

struct Node* createNode()
{
	struct Node *n;
	n = (struct Node*)malloc(sizeof(struct Node));
	return n;
}

void insert(bool flag, int item)
{
	struct Node *node,*curr,*curr2;
	node = createNode();
	node->data = item;
	node->right = NULL;
	node->down = NULL;

	if(head!=NULL && flag==false)
	{
		curr = head;
		while(curr->right!=NULL)
		{
			curr = curr->right;
		}
		curr2 = curr;
		
			while(curr2->down != NULL)
			{
				curr2 = curr2->down;
			}
			curr2->down = node;
			node->down = NULL;
			node->right = NULL;
			
	}
	else if(head!=NULL && flag==true)
	{
			curr =  head;
			node->right = NULL;
			while(curr->right!=NULL)
			{
				curr = curr->right;
			}
			curr->right = node;
			node->down = NULL;
	}
	else if(head==NULL && flag==true)
	{
		head = node;
	}	
}
void print()
{
	
	struct Node *curr,*curr2;
	curr = head;
	while(curr->right != NULL)
	{
		curr2 = curr;
		while(curr2->down!=NULL)
		{
			printf("%d, ",curr2->data);
			curr2 = curr2->down;	
		}
		printf("%d, ",curr2->data);
		printf("\n");
		curr = curr->right;
	}
		curr2 = curr;
		while(curr2->down!=NULL)
		{
			printf("%d, ",curr2->data);
			curr2 = curr2->down;
		}
		printf("%d",curr2->data);
		printf("\n");		
}
int countRows()
{
	int num = 1;
	struct Node *curr,*curr2;
	curr = head;
	while(curr->right != NULL)
	{
		num++;
		curr = curr->right;
	}
	return num;
}
int findAt(int row, int col)
{
	int rows_count = countRows();
	int row_counter = 0, col_counter = 0;
	bool flag = false;
	struct Node *curr,*curr2;
	curr = head;
	while(curr->right != NULL)
	{
		flag = false;
		if(row_counter == row && row_counter<=rows_count)
		{
			col_counter =0;
			curr2 = curr;
			while(curr2->down!=NULL)
			{
				
				if(col_counter == col)
				{
					printf("\n%d",curr2->data);
					col_counter++;
					flag = true;
					break;		
				}
				else
				{
					col_counter++;
					curr2 = curr2->down;
				}
			}
			if(col_counter==col)
			{
				printf("\n%d",curr2->data);
			}
			curr = curr->right;
		}
		else
		{
			row_counter++;
			curr = curr->right;
		}	
	}
	
	if(row_counter == row)
	{
			col_counter =0;
			curr2 = curr;
			while(curr2->down!=NULL)
			{
				
				if(col_counter == col)
				{
					printf("\n%d",curr2->data);
					col_counter++;
					flag = true;
					break;		
				}
				else
				{
					col_counter++;
					curr2 = curr2->down;
				}
			}
			if(col_counter==col)
			{
				printf("\n%d",curr2->data);
			}
	}
	
	
	
	
	
	
}
int main()
{
	int r,c,counter=1;
	bool flag = false;
	printf("Enter no of rows");
	scanf("%d",&r);
	for(int i=0;i<r;i++)
	{
		printf("How many items you wish to insert in row %d ?\n",(i+1));
		scanf("%d",&c);
		printf("\nEnter %d values\n",c);
		for(int j =0;j<c;j++)
		{
			int item;
			scanf("%d",&item);
			if(j==0)
			{
				flag = true;
				insert(flag,item);
				flag = false;
			}
			else
			{
				insert(flag, item);
			}
		
		}
	}
	print();
	printf("\n");
	findAt(1,3);
	//findAt(16,2);
	//findAt(3,15);
	findAt(2,1);
	return 0;
}
