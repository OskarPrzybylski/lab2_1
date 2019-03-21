package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch_search_whenSeqLengthIsOne_andElementIsInSeq(){
        int[] seq = {1};
        int key = 1;

        SearchResult result = BinarySearch.search(key,seq);

        Assert.assertThat(result.isFound(), is(true));

    }

    @Test
    public void binarySearch_search_whenSegLengthIsOne_andElementIsNotInSeq(){
        int[] seq = {3};
        int key = 2;

        SearchResult result = BinarySearch.search(key,seq);

        Assert.assertThat(result.isFound(), is(false));
    }

    @Test
    public void binarySearch_search_whenSegLengthIsMoreThenOne_andElementIsAtFirstPlace(){
        int[] seq = {5,6,7};
        int key = 5;

        SearchResult result = BinarySearch.search(key,seq);

        Assert.assertThat(result.getPosition(), is(0));
    }

    @Test
    public void binarySearch_search_whenSeqLengthIsMoreThenOne_andElementIsAtLastPlace(){
        int[] seq = {3,4,8};
        int key = 8;

        SearchResult result = BinarySearch.search(key,seq);

        Assert.assertThat(result.getPosition(), is(2));
    }

    @Test
    public void binarySearch_search_whenSeqLengthIsMoreThenOne_andElementIsInTheMiddle(){
        int[] seq = {1,2,3};
        int key = 2;

        SearchResult result = BinarySearch.search(key,seq);

        Assert.assertThat(result.getPosition(), is(1));
    }

    @Test
    public void binarySearch_search_whenSeqLengthIsMoreThenOne_andElementIsNotInTheSeq(){
        int[] seq = {0,2,7};
        int key = 4;

        SearchResult result = BinarySearch.search(key,seq);

        Assert.assertThat(result.isFound(), is(false));
    }
}
