package com.gauravbajaj.actionlist.models;

/**
 * Created by gauravb on 02/10/17.
 */
public class ListViewItem {
    int type;
    Object object;

    public ListViewItem(int type, Object object) {
        this.type = type;
        this.object = object;

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}



