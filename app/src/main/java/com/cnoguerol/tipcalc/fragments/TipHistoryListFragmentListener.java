package com.cnoguerol.tipcalc.fragments;

import com.cnoguerol.tipcalc.model.TipRecord;

/**
 * Created by cnoguerol.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
