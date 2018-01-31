public int makeChocolate(int small, int big, int goal) {
	  int g = goal;
	    for(int i = 0; i < big; i ++){
		        if(g < 5) break;
			    g -= 5;
			      }
	      if(g == 0) return 0;
	        if(g <= small) return (g - small) + small;
		  return -1;
}

