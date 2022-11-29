package qg;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    public int f49475e;

    /* renamed from: f  reason: collision with root package name */
    public int f49476f;

    /* renamed from: g  reason: collision with root package name */
    public int f49477g;

    /* renamed from: h  reason: collision with root package name */
    public int f49478h;

    /* renamed from: i  reason: collision with root package name */
    public int f49479i;

    /* renamed from: j  reason: collision with root package name */
    public float f49480j;

    /* renamed from: k  reason: collision with root package name */
    public float f49481k;

    /* renamed from: l  reason: collision with root package name */
    public int f49482l;

    /* renamed from: m  reason: collision with root package name */
    public int f49483m;

    /* renamed from: o  reason: collision with root package name */
    public int f49485o;

    /* renamed from: p  reason: collision with root package name */
    public int f49486p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f49487q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f49488r;

    /* renamed from: a  reason: collision with root package name */
    public int f49471a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f49472b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f49473c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f49474d = Integer.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public List<Integer> f49484n = new ArrayList();

    public int a() {
        return this.f49477g;
    }

    public int b() {
        return this.f49478h;
    }

    public int c() {
        return this.f49478h - this.f49479i;
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        this.f49471a = Math.min(this.f49471a, (view.getLeft() - bVar.m1()) - i10);
        this.f49472b = Math.min(this.f49472b, (view.getTop() - bVar.d0()) - i11);
        this.f49473c = Math.max(this.f49473c, view.getRight() + bVar.G1() + i12);
        this.f49474d = Math.max(this.f49474d, view.getBottom() + bVar.j1() + i13);
    }
}
