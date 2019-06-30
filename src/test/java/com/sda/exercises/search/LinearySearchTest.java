package com.sda.exercises.search;

import com.sda.exercises.LinearySearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LinearySearchTest {

    @Test
    public void search(){
        //given
        LinearySearch linearySearch = new LinearySearch();
        Object ArrayList;
        List<Integer> list = ArrayList<>(Arrays.asList(3, 5, 4, 2, 0));
        // when
        int indexSearched = linearySearch.search(list, 5);
        int expected = 1;
        // then
        Assert.assertArrayEquals(returned, expected);
    }
}
