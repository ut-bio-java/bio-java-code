import java .util.*;
public class DnaToRna
{
	public static void main( String [ ] args) 
	{
		Scanner sc=new Scanner ( System.in);
		String dna,rna;
		System.out.println ("DNA :");
		dna=sc.next( );
		rna=dna.replace('T','U');
		System.out.println( "RNA:"+rna);
	}
}
