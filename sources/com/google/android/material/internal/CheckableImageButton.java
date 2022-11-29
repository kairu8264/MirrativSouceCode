package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import o3.c0;
import p3.c;

/* loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f27675z = {16842912};

    /* renamed from: w  reason: collision with root package name */
    public boolean f27676w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f27677x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f27678y;

    /* loaded from: classes3.dex */
    public class a extends o3.a {
        public a() {
        }

        @Override // o3.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // o3.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.Z(CheckableImageButton.this.a());
            cVar.a0(CheckableImageButton.this.isChecked());
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends v3.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public boolean f27680w;

        /* loaded from: classes3.dex */
        public static class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void a(Parcel parcel) {
            this.f27680w = parcel.readInt() == 1;
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27680w ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f28615b0);
    }

    public boolean a() {
        return this.f27677x;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27676w;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f27676w) {
            int[] iArr = f27675z;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.f27680w);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f27680w = this.f27676w;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f27677x != z10) {
            this.f27677x = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f27677x || this.f27676w == z10) {
            return;
        }
        this.f27676w = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f27678y = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f27678y) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f27676w);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27677x = true;
        this.f27678y = true;
        c0.r0(this, new a());
    }
}
