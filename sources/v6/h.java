package v6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<a7.m, Path>> f56792a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a<Integer, Integer>> f56793b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a7.h> f56794c;

    public h(List<a7.h> list) {
        this.f56794c = list;
        this.f56792a = new ArrayList(list.size());
        this.f56793b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f56792a.add(list.get(i10).b().a());
            this.f56793b.add(list.get(i10).c().a());
        }
    }

    public List<a<a7.m, Path>> a() {
        return this.f56792a;
    }

    public List<a7.h> b() {
        return this.f56794c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f56793b;
    }
}
