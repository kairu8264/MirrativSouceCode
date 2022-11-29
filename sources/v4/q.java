package v4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import v4.q0;
import z4.h;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f56650a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f56651b;

    /* renamed from: c  reason: collision with root package name */
    public final String f56652c;

    /* renamed from: d  reason: collision with root package name */
    public final q0.d f56653d;

    /* renamed from: e  reason: collision with root package name */
    public final List<q0.b> f56654e;

    /* renamed from: f  reason: collision with root package name */
    public final q0.e f56655f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Object> f56656g;

    /* renamed from: h  reason: collision with root package name */
    public final List<w4.a> f56657h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f56658i;

    /* renamed from: j  reason: collision with root package name */
    public final q0.c f56659j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f56660k;

    /* renamed from: l  reason: collision with root package name */
    public final Executor f56661l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f56662m;

    /* renamed from: n  reason: collision with root package name */
    public final Intent f56663n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f56664o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f56665p;

    /* renamed from: q  reason: collision with root package name */
    public final Set<Integer> f56666q;

    /* renamed from: r  reason: collision with root package name */
    public final String f56667r;

    /* renamed from: s  reason: collision with root package name */
    public final File f56668s;

    /* renamed from: t  reason: collision with root package name */
    public final Callable<InputStream> f56669t;

    @SuppressLint({"LambdaLast"})
    public q(Context context, String str, h.c cVar, q0.d dVar, List<q0.b> list, boolean z10, q0.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, q0.e eVar, List<Object> list2, List<w4.a> list3) {
        this.f56650a = cVar;
        this.f56651b = context;
        this.f56652c = str;
        this.f56653d = dVar;
        this.f56654e = list;
        this.f56658i = z10;
        this.f56659j = cVar2;
        this.f56660k = executor;
        this.f56661l = executor2;
        this.f56663n = intent;
        this.f56662m = intent != null;
        this.f56664o = z11;
        this.f56665p = z12;
        this.f56666q = set;
        this.f56667r = str2;
        this.f56668s = file;
        this.f56669t = callable;
        this.f56656g = list2 == null ? Collections.emptyList() : list2;
        this.f56657h = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f56665p) {
            return false;
        }
        return this.f56664o && ((set = this.f56666q) == null || !set.contains(Integer.valueOf(i10)));
    }
}
