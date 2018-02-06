package com.android.zhhr.utils;

import com.android.zhhr.data.entity.Comic;
import com.android.zhhr.data.entity.db.DBSearchResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张皓然 on 2018/2/6.
 */

public class DBEntityUtils {
    public static List<Comic> transSearchToComic(List<DBSearchResult> results) {
        List<Comic> comics = new ArrayList<>();
        for(int i=0;i<results.size();i++){
            Comic comic = new Comic();
            comic.setTitle(results.get(i).getTitle());
            comics.add(comic);
        }
        return comics;
    }
}
