package countryproject;
import java.util.Iterator;


import java.io.IOException;
//import java.util.Iterator;




import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

	public class countreducer extends Reducer<Text, IntWritable, Text, IntWritable>{

		@Override
		protected void reduce(Text arg0, Iterable<IntWritable> arg1,
				Reducer<Text, IntWritable, Text, IntWritable>.Context arg2)
				throws IOException, InterruptedException {
			
		/*ques g	int min;
			Iterator<IntWritable> i=arg1.iterator();
			min=i.next().get();
			for(IntWritable iw:arg1)
			{
				int s=iw.get();
				if(min<s)
				{
					min=s;
					
				}
				
			}
			arg2.write(new Text(arg0),new IntWritable(min));
			
			
		}
		

	}  */
/*ques j			int n1 = Integer.parseInt(arg0.toString());
			
			for(IntWritable t:arg1)
			{
				n1+=t.get();
			}
			arg2.write(new Text(arg0), new IntWritable(n1));
			}

	}*/
			
			int max;
			Iterator<IntWritable> i=arg1.iterator();
			max=i.next().get();
			for(IntWritable iw:arg1)
			{
				int s=iw.get();
				if(max<s)
				{
					max=s;
					
				}
				
			}
			arg2.write(new Text("Max"),new IntWritable(max));
			
			
		}
	}

	
	
	
	

	
			/*ques5		int n1=0;
			for(IntWritable t:arg1)
			{
				n1+=t.get();
			}
			arg2.write(arg0, new IntWritable(n1));
			}

	}*/
	
	/*QUES1-
	 * int n1=0;
	for(IntWritable t:arg1)
	{
		n1+=t.get();
	}
	arg2.write(arg0, new IntWritable(n1));
	}*/



		/*	int max;
			Iterator<IntWritable> i=arg1.iterator();
			max=i.next().get();
			for(IntWritable iw:arg1)
			{
				int s=iw.get();
				if(max<s)
				{
					max=s;
					
				}
				
			}
			arg2.write(new Text("Max"),new IntWritable(max));
			
			
		}
		

	}
	*/
