Dịch máy hữu hạn trạng thái sau thành máy SMV.

![image](https://user-images.githubusercontent.com/48431650/96659260-b7738c00-1370-11eb-8572-5036a397f9c6.png)

        MODULE main
        #define false 0
        #define true 1
        VAR
        	x, y : boolean;
        ASSIGN
        	init (x) := true;
        	init (y) := false;

        	next (x) := case
        		x & !y : false;
        		!x & y : true;
        		!x & !y : true;
        		true : x;
        	esac;

        	next (y) := case
        		!x & y : false;
        		!y : true;
         		true : y;
        	esac;