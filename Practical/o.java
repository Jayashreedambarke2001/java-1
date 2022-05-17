
	package corejava;



	   class o {
		public void print_geek() {
			System.out.println("Geeks");
		}
	}

	class two extends o {
		public void print_for() {
			System.out.println("for");
		}
	}

	class three extends two{
		public void print_geek() 
		{
			System.out.println("Geeks");
		}
	} // Derived class public

	 class multi {
		public static void main(String[] args) {
			three g = new three();
			g.print_geek();
			g.print_for();
			g.print_geek();
		}
	}


