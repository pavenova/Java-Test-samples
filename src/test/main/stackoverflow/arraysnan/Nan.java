package test.main.stackoverflow.arraysnan;

//https://stackoverflow.com/questions/48261453/array-of-double-variable-showing-nan-as-output-while-calculating-information-gai
public class Nan {

	public static void nanError() {
		try {
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			double P, N, IGtotal;

			/*
			System.out.println("How many total P values?");
			P = Double.parseDouble(br.readLine());
			*/
			
			P = 9;

			/*System.out.println("How many total N values?");
			N = Double.parseDouble(br.readLine());
			*/
			N = 5;

			IGtotal = ((-1) * (P / (P + N)) * ((Math.log(P / (P + N))) / Math.log(2)))
					+ ((-1) * (N / (P + N)) * ((Math.log(N / (P + N))) / Math.log(2)));
			System.out.println("Overall Information gain = " + IGtotal);

			int numV;
			/*
			System.out.println("How many distinct values of an attribute?");
			numV = Integer.parseInt(br.readLine());
			*/
			numV = 3;

			double[] p = new double[numV];
			double[] n = new double[numV];
			double[] ig = new double[numV];

			int i, temp = 0;
			/*
			System.out.println("Enter pi for all attributes");
			for (i = 0; i < numV; i++)
				p[i] = Integer.parseInt(br.readLine());
			*/
			p[0] = 2;
			p[1] = 4;
			p[2] = 3;
			
			/*
			System.out.println("Enter ni for all attributes");
			for (i = 0; i < numV; i++)
				n[i] = Integer.parseInt(br.readLine());
			*/
			n[0] = 3;
			n[1] = 0;
			n[2] = 2;
			
			
			System.out.println("Attribute\tpi\tni\tI(pi,ni)");
			for (i = 0; i < numV; i++) {
				temp = i;
				ig[i] = ((-1) * (p[i] / (p[i] + n[i])) * ((Math.log(p[i] / (p[i] + n[i]))) / Math.log(2)))
						+ ((-1) * (n[i] / (p[i] + n[i])) * ((Math.log(n[i] / (p[i] + n[i]))) / Math.log(2)));
				
				System.out.println("attrib" + (temp + 1) + "\t\t" + p[i] + "\t\t" + n[i] + "\t\t" + ig[i]);
				
				if(Double.toString(ig[i]).equals("NaN")) {
					System.out.print("NaN!- ");
					System.out.println("i=" + i +"; " + "n=" +n[i]+"; " + "p= " + p[i]);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
