ackage countryproject;

	import java.io.IOException;

	import org.apache.hadoop.conf.Configuration;
	import org.apache.hadoop.fs.Path;
	import org.apache.hadoop.io.IntWritable;
	import org.apache.hadoop.io.Text;
	import org.apache.hadoop.mapreduce.Job;
	import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
	import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class countdriver {
	
		public static void main(String ...ar) throws IOException, ClassNotFoundException, InterruptedException
		{
		Configuration c=new Configuration();
		Job j=new Job(c,"values");
		j.setJarByClass(countdriver.class);
		j.setMapperClass(countmapper.class);
		j.setReducerClass(countreducer.class);
	  //  j.setPartitionerClass(crickparti.class);
		//j.setNumReduceTasks(3);
		j.setMapOutputKeyClass(Text.class);
		j.setMapOutputValueClass(IntWritable.class);
		Path input=new Path(ar[0]);
		Path output=new Path(ar[1]);
		FileInputFormat.setInputPaths(j, input);
		FileOutputFormat.setOutputPath(j, output);
		j.waitForCompletion(true);
		
		}

	}