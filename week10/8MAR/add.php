<body>  
<form>  
NUMBER ONE:	<input type="number" name="one" /><br><br>  
NUMBER TWO:	<input type="number" name="two" /><br><br>  
SUBMIT:		<input  type="submit" name="submit" value="Add">  
</form>  
 </body>  
<?php      

if(isset($_GET['one'])){
@$number1=$_GET['one'];   
@$number2=$_GET['two'];   

$no=$number1+$number2;
echo "Sum of $number1 and $number2 is=".$no;  
}
?>  