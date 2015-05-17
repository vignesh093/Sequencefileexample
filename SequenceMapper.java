import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class SequenceMapper extends Mapper<LongWritable,Text,IntWritable,Text> 
{
	public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException
{
	{
		String s=value.toString();
		String[] myval=s.split(",");
		context.write(new IntWritable(Integer.parseInt(myval[0])),new Text(myval[1]));
	}
}
}
