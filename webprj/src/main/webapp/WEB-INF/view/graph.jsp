<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<div id="main">


    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        
    google.charts.load('current', {'packages':['line']});
      google.charts.setOnLoadCallback(drawChart);

	  var weaponType = new Array();
	  var year = new Array();
	  var num = new Array();
	  var count = 0;
 	 
      
      function drawChart() {

          var i;
          var arr = [];
          arr.push(['year','num']);
          
          for(i = 0; i < count; i++)
          {     	  
        	  arr.push([year[i], num[i]]);
          }
        
        var data = google.visualization.arrayToDataTable(arr);
   
        var options = {
        		 chart: {
        	          title: 'Box Office Earnings in First Two Weeks of Opening',
        	          subtitle: 'in millions of dollars (USD)'
        	        },
        	        width: 900,
        	        height: 500,
        	        axes: {
        	          x: {
        	            0: {side: 'top'}
        	          }
        	        }
        };

        var chart = new google.charts.Line(document.getElementById('line_top_x'));

        chart.draw(data, google.charts.Line.convertOptions(options));
      }
    </script>
    <c:forEach items="${list}" var="item">
  			<script type="text/javascript" >
	    		/*<![CDATA[*/
	      		
	      		year[count] = [[${item.getEvent_year()}]];
	      		num[count] = [[${item.getNum()}]];
	      		count++;
	    		/*]]>*/
  			</script>
	 </c:forEach>
  
    


  <div id="line_top_x"></div>


</div>