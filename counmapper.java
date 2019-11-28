package countryproject;

	import java.io.IOException;

	import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

	public class countmapper extends Mapper<LongWritable, Text, Text, IntWritable> {

		@Override
		protected void map(LongWritable key, Text value,
				Mapper<LongWritable, Text, Text, IntWritable>.Context context)
				throws IOException, InterruptedException {
			String []line=value.toString().split(",");
			
		}
	}/*
	
	*/
	
			/*		for(int i=1;i<line.length;i++)
			{
			
			
			context.write(new Text("value"), new IntWritable(Integer.parseInt(line[1].toString().trim())));
		}
	}
	}*/
		
			
/*ques j				if(!line[18].isEmpty()){
					
					context.write(new Text(line[18]), new IntWritable(1));
			}
			}
				
			}*/
/*ques 11if(!line[25].isEmpty() & !line[27].isEmpty()){
				
				context.write(new Text("number"), new IntWritable(1));
		}
		}
	}
		*/	

/*if(!line[5].isEmpty()){
				
				context.write(new Text(line[5]), new IntWritable(1));
		}
			
			

		}
	}*/
 /*if(Integer.parseInt(line[2])==1){
	for(int i=1;i<line.length;i++)
	{
	//int area=Integer.parseInt(line[3]);
	
	context.write(new Text(line[3].toString().trim()), new IntWritable(Integer.parseInt(line[0].toString().trim())));
}
		}
	}
	}
	*/		
			

			
/*ques1	if(!line[1].isEmpty()){
				
				context.write(new Text(line[1]), new IntWritable(1));
		}
			
			

		}
		*/
			/*Ques3	if(!line[25].isEmpty()){
			
			context.write(new Text(line[25]), new IntWritable(1));
	}
		
		

	}
	
}*/