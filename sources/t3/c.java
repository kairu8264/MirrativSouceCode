package t3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {
    private int mDropDownLayout;
    private LayoutInflater mInflater;
    private int mLayout;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.mDropDownLayout = i10;
        this.mLayout = i10;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // t3.a
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mDropDownLayout, viewGroup, false);
    }

    @Override // t3.a
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mLayout, viewGroup, false);
    }

    public void setDropDownViewResource(int i10) {
        this.mDropDownLayout = i10;
    }

    public void setViewResource(int i10) {
        this.mLayout = i10;
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.mDropDownLayout = i10;
        this.mLayout = i10;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.mDropDownLayout = i10;
        this.mLayout = i10;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
