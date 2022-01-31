package com.greatlearning.DS;

import java.util.Stack;

public class BalancingBrackets 
{

	private String inputBraceSeq;
	
	public BalancingBrackets(String str) {
		
		inputBraceSeq =str;
		// TODO Auto-generated constructor stub
	}

	public boolean checbraceSeq()
	{
		
		boolean ret =true;
		if(inputBraceSeq.length()%2!=0)
		{
			ret =false;
			//System.out.println("invalid length");
		}
		
		else
		{
			Stack<Character> stack =new Stack<Character>();
			for (int i=0;i<inputBraceSeq.length();i++)
			{
				char ch =inputBraceSeq.charAt(i);
				//push open brackets to stakc and compare 	if opening brackets have occured if there are closing brackets
				
				if (ch=='{' || ch =='[' || ch== '(')
				{
					stack.push(ch);
				}
				
				else if(stack.isEmpty())
				{
					//System.out.println("STACK empty no input done");
					ret =false;
					break;
				}
				
				else if(ch == '}')
				{
					if(stack.peek()=='{') //to retrive the 1st element of the stack or whatever element is present at the top of the stack
					{
						stack.pop();
						
					}
					else
					{
					//	System.out.println("unable to find {");
						ret =false;
						break;
					}
				}
				
				else if(ch == ')')
				{
					if(stack.peek()=='(') //to retrive the 1st element of the stack or whatever element is present at the top of the stack
					{
						stack.pop();
					}
					else
					{
						//System.out.println("unable to find (");
						ret =false;
						break;
					}
				}
				else if(ch == ']')
				{
					if(stack.peek()=='[') //to retrive the 1st element of the stack or whatever element is present at the top of the stack
					{
						stack.pop();
					}
					else
					{
						//System.out.println("unable to find [");
						ret =false;
						break;
					}
				}
	

			}
			
			if (!stack.isEmpty())
			{
				ret =false;
			}
			
			else
			{
				ret =true;
			}
			
		}
		return ret;
		
	}
	
	//args brackets expression ....({[]})
	//boolean 
	
	//P2
	//INIT STACK
	//ACROSS EACH CHARACTER
	//FETCH EACH CHAR
	//CHCECK IF EACH CHARACTER IS OPENIG BRACKETS
	//PUSH AND CONTINUE
	//POP FROM STATCK
	//SWITCH CASE ON POPPED CHARACTER 
	//DIFF CASES FOR CLSOING CHAR
	//FOR EACH OF THE CASE CHECK POPPED ELEMENT IS CORRESPONDINGBRACKET 
	
	//STACK.ISEMPTY()
	
	
	
	}


