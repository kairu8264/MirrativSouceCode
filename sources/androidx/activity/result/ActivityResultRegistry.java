package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    public Random f14068a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f14069b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f14070c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, d> f14071d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f14072e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, c<?>> f14073f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f14074g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f14075h = new Bundle();

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14080a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f14081b;

        public a(String str, c.a aVar) {
            this.f14080a = str;
            this.f14081b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, b3.b bVar) {
            Integer num = ActivityResultRegistry.this.f14070c.get(this.f14080a);
            if (num != null) {
                ActivityResultRegistry.this.f14072e.add(this.f14080a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f14081b, i10, bVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f14072e.remove(this.f14080a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f14081b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f14080a);
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14083a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f14084b;

        public b(String str, c.a aVar) {
            this.f14083a = str;
            this.f14084b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, b3.b bVar) {
            Integer num = ActivityResultRegistry.this.f14070c.get(this.f14083a);
            if (num != null) {
                ActivityResultRegistry.this.f14072e.add(this.f14083a);
                ActivityResultRegistry.this.f(num.intValue(), this.f14084b, i10, bVar);
                return;
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f14084b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f14083a);
        }
    }

    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.b<O> f14086a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a<?, O> f14087b;

        public c(androidx.activity.result.b<O> bVar, c.a<?, O> aVar) {
            this.f14086a = bVar;
            this.f14087b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final o f14088a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<r> f14089b = new ArrayList<>();

        public d(o oVar) {
            this.f14088a = oVar;
        }

        public void a(r rVar) {
            this.f14088a.a(rVar);
            this.f14089b.add(rVar);
        }

        public void b() {
            Iterator<r> it = this.f14089b.iterator();
            while (it.hasNext()) {
                this.f14088a.c(it.next());
            }
            this.f14089b.clear();
        }
    }

    public final void a(int i10, String str) {
        this.f14069b.put(Integer.valueOf(i10), str);
        this.f14070c.put(str, Integer.valueOf(i10));
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f14069b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f14073f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.b<?> bVar;
        String str = this.f14069b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f14073f.get(str);
        if (cVar != null && (bVar = cVar.f14086a) != null) {
            if (this.f14072e.remove(str)) {
                bVar.a(o10);
                return true;
            }
            return true;
        }
        this.f14075h.remove(str);
        this.f14074g.put(str, o10);
        return true;
    }

    public final <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar != null && cVar.f14086a != null && this.f14072e.contains(str)) {
            cVar.f14086a.a(cVar.f14087b.c(i10, intent));
            this.f14072e.remove(str);
            return;
        }
        this.f14074g.remove(str);
        this.f14075h.putParcelable(str, new androidx.activity.result.a(i10, intent));
    }

    public final int e() {
        int nextInt = this.f14068a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (!this.f14069b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f14068a.nextInt(2147418112);
        }
    }

    public abstract <I, O> void f(int i10, c.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, b3.b bVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f14072e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f14068a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f14075h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f14070c.containsKey(str)) {
                Integer remove = this.f14070c.remove(str);
                if (!this.f14075h.containsKey(str)) {
                    this.f14069b.remove(remove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f14070c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f14070c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f14072e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f14075h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f14068a);
    }

    public final <I, O> androidx.activity.result.c<I> i(final String str, u uVar, final c.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        o g10 = uVar.g();
        if (!g10.b().a(o.c.STARTED)) {
            k(str);
            d dVar = this.f14071d.get(str);
            if (dVar == null) {
                dVar = new d(g10);
            }
            dVar.a(new r() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.r
                public void i(u uVar2, o.b bVar2) {
                    if (o.b.ON_START.equals(bVar2)) {
                        ActivityResultRegistry.this.f14073f.put(str, new c<>(bVar, aVar));
                        if (ActivityResultRegistry.this.f14074g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f14074g.get(str);
                            ActivityResultRegistry.this.f14074g.remove(str);
                            bVar.a(obj);
                        }
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) ActivityResultRegistry.this.f14075h.getParcelable(str);
                        if (aVar2 != null) {
                            ActivityResultRegistry.this.f14075h.remove(str);
                            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
                        }
                    } else if (o.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f14073f.remove(str);
                    } else if (o.b.ON_DESTROY.equals(bVar2)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f14071d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + uVar + " is attempting to register while current state is " + g10.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> j(String str, c.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        k(str);
        this.f14073f.put(str, new c<>(bVar, aVar));
        if (this.f14074g.containsKey(str)) {
            Object obj = this.f14074g.get(str);
            this.f14074g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f14075h.getParcelable(str);
        if (aVar2 != null) {
            this.f14075h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    public final void k(String str) {
        if (this.f14070c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final void l(String str) {
        Integer remove;
        if (!this.f14072e.contains(str) && (remove = this.f14070c.remove(str)) != null) {
            this.f14069b.remove(remove);
        }
        this.f14073f.remove(str);
        if (this.f14074g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f14074g.get(str));
            this.f14074g.remove(str);
        }
        if (this.f14075h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f14075h.getParcelable(str));
            this.f14075h.remove(str);
        }
        d dVar = this.f14071d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f14071d.remove(str);
        }
    }
}
