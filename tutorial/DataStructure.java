package tutorial;

/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    protected int get(int nextIndex) {
        return Integer.valueOf(arrayOfInts[nextIndex]);
    }

    protected int size() {
        return SIZE;
    }
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i+10;
        }
    }

    public static boolean isEvenIndex(Integer a){
        return a%2==0;        
    }
    public static boolean isOddIndex(Integer a){
        return a%2!=0;        
    }
    
    
    public void print(java.util.function.Function<Integer, Boolean> iterator){
        
        for (int i = 0; i < SIZE; i++) {
            if(iterator.apply(i)) {
                System.out.print(Integer.valueOf(arrayOfInts[i])+ " ");
            }
        }
        System.out.println();
    }
    

    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
        
    }

    public void print(DataStructureIterator iterator){
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

       
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        DataStructure ds = new DataStructure();
        
        // values of even indices
        System.out.println("printEven: Values of even indices");
        ds.printEven();


        /*a.Define a method named print(DataStructureIterator iterator). 
        Invoke this method with an instance of the class EvenIterator 
        so that it performs the same function as the method printEven.*/
        System.out.println("print(DataStructureIterator iterator)");
        EvenIterator ei = ds.new EvenIterator();
        ds.print(ei);

        /*b.Invoke the method print(DataStructureIterator iterator) so that it prints elements 
        that have an odd index value. Use an anonymous class as the method's argument instead 
        of an instance of the interface DataStructureIterator.*/

        System.out.println("print(DataStructureIterator) with "
            + "anonymous class, odd indicies");
        ds.print(
            new DataStructure.DataStructureIterator() {
                private int nextIndex = 1;
                public boolean hasNext() {
                    return (nextIndex <= ds.size() - 1);
                }
                public Integer next() {
                    int retValue = ds.get(nextIndex);
                    nextIndex += 2;
                    return retValue;
                }
            }
        );

        /* c.Define a method named print(java.util.function.Function<Integer, Boolean> iterator) 
        that performs the same function as print(DataStructureIterator iterator). 
        Invoke this method with a lambda expression to print elements that have an even index value. 
        Invoke this method again with a lambda expression to print elements that have an odd index value. */
        System.out.println("c. print(java.util.function.Function<Integer, Boolean> iterator)");
        ds.print(i -> i%2==0);
        ds.print(i -> i%2!=0);

        /* d.Define two methods so that the following two statements 
        print elements that have an even index value and elements that have an odd index value: */
        System.out.println("d. print(java.util.function.Function<Integer, Boolean> iterator)");
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);

    }

}
//Define a method named print(DataStructureIterator iterator). 
//Invoke this method with an instance of the class EvenIterator so that it performs the same function as the method printEven.