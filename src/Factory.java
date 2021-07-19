class Factory{
     CalculeAbstract test(String object)
    {
        if(object.equals("Addition"))
        
            return new Addition();       
        else
         return new Multiplication();
    }
}