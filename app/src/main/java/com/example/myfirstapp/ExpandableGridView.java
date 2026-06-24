package com.example.myfirstapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * ExpandableGridView is a custom GridView that overrides onMeasure to expand
 * to its content's full height. This prevents nested scrolling conflicts when
 * placed inside a ScrollView.
 */
public class ExpandableGridView extends GridView {

    public ExpandableGridView(Context context) {
        super(context);
    }

    public ExpandableGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExpandableGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // Measure the GridView to expand to its full height by specifying AT_MOST
        // with the maximum possible size mask.
        int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
