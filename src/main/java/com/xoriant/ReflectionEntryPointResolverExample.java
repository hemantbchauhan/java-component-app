package com.xoriant;

public class ReflectionEntryPointResolverExample {

		/**
		 * This method gets invoked when the Mule payload contains an array of two String elements.
		 */
		public String multipleArgumentsMethod(String arg1, String arg2) {
			return "Request resolved to multipleArgumentsMethod (" + arg1 + ", " + arg2 + ")";
		}

		/**
		 * This method gets invoked when the Mule payload contains one single String element.
		 */
		public String singleArgumentMethod(String arg1) {
			return "Request resolved to singleArgumentsMethod(" + arg1 + ")";
		}

		/**
		 * This method gets invoked when a Mule request contains null payload..
		 */
		public String noArgumentsMethod() {
			return "Request resolved to noArgumentsMethod";
		}

	
}

