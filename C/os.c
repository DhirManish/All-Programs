#include<stdio.h>

main(){
	#if defined(_linux_)
		printf("you are on linux os");
	#elseif defined (_window_)
		printf("window");
	#else
		printf("mac or ruspberrypi\n");
	#endif
}
