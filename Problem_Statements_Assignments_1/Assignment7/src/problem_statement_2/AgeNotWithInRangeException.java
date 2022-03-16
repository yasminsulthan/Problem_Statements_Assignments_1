package problem_statement_2;

	class AgeNotWithInRangeException extends Exception
	{
	     /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public String toString()
	     {
	          return ("Age is not between 15 and 21. please ReEnter the Age");
	     }
	}

