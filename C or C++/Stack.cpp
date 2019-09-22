#include<stdio.h>
#include <malloc.h>

struct ArrayStack
{
	int top;
	unsigned capacity;
	int *arr;
};
struct ArrayStack* createStack(int cap)                     //return type ArrayStack wali h... we will return address
{
	struct ArrayStack *stack;
	stack = (struct ArrayStack *)malloc(sizeof(struct ArrayStack));    //address hai isme stack ka
	stack->capacity = cap;
	stack->top = -1;
	stack->arr = (int *)malloc(sizeof(int)*stack->capacity);
	return stack;
}

int isFull(struct ArrayStack *stack)
{	
	if(stack->top == stack->capacity -1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
int isEmpty(struct ArrayStack *stack)
{	
	if(stack->top == -1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
void push(struct ArrayStack *stack, int item)
{
	if(!isFull(stack))
	{
		stack->top++;
		stack->arr[stack->top] = item;
	}
	else
	{
		printf("FULL");
	}	
}
int pop(struct ArrayStack *stack)
{
	if(!isEmpty(stack))
	{
		
		int item = stack->arr[stack->top];
		stack->top--;
		return item;
	}
	else
	{
		return -1;
	}
}
int main()
{
	int choice,item,flag=1;
	struct ArrayStack *stack;
	stack = createStack(5);
	while(flag == 1)
	{
		printf("\n1. Push");
		printf("\n2. Pop");
		printf("\n3. Exit");
		printf("\nEnter Your Choice");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				printf("\nEnter Number");
				scanf("%d",&item);
				push(stack,item);
				break;
			case 2:
				item = pop(stack);
				if(item==-1)
				{
					printf("Stack is EMPTY");
				}
				else
				{
					printf("Popped value is %d",item);
				}
				break;
			case 3:
				flag=0;
				break;
		}	
	}	
	return 0;
}

