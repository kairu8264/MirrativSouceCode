package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import k5.f;
import k5.o;
import k5.v;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public UUID f16518a;

    /* renamed from: b  reason: collision with root package name */
    public b f16519b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f16520c;

    /* renamed from: d  reason: collision with root package name */
    public a f16521d;

    /* renamed from: e  reason: collision with root package name */
    public int f16522e;

    /* renamed from: f  reason: collision with root package name */
    public Executor f16523f;

    /* renamed from: g  reason: collision with root package name */
    public w5.a f16524g;

    /* renamed from: h  reason: collision with root package name */
    public v f16525h;

    /* renamed from: i  reason: collision with root package name */
    public o f16526i;

    /* renamed from: j  reason: collision with root package name */
    public f f16527j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f16528a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f16529b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f16530c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, Executor executor, w5.a aVar2, v vVar, o oVar, f fVar) {
        this.f16518a = uuid;
        this.f16519b = bVar;
        this.f16520c = new HashSet(collection);
        this.f16521d = aVar;
        this.f16522e = i10;
        this.f16523f = executor;
        this.f16524g = aVar2;
        this.f16525h = vVar;
        this.f16526i = oVar;
        this.f16527j = fVar;
    }

    public Executor a() {
        return this.f16523f;
    }

    public f b() {
        return this.f16527j;
    }

    public UUID c() {
        return this.f16518a;
    }

    public b d() {
        return this.f16519b;
    }

    public Network e() {
        return this.f16521d.f16530c;
    }

    public o f() {
        return this.f16526i;
    }

    public int g() {
        return this.f16522e;
    }

    public Set<String> h() {
        return this.f16520c;
    }

    public w5.a i() {
        return this.f16524g;
    }

    public List<String> j() {
        return this.f16521d.f16528a;
    }

    public List<Uri> k() {
        return this.f16521d.f16529b;
    }

    public v l() {
        return this.f16525h;
    }
}
