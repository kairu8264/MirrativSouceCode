package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface g0 {

    /* loaded from: classes.dex */
    public static class a implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<v> f16115a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f16116b = 0;

        /* renamed from: androidx.recyclerview.widget.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0075a implements c {

            /* renamed from: a  reason: collision with root package name */
            public SparseIntArray f16117a = new SparseIntArray(1);

            /* renamed from: b  reason: collision with root package name */
            public SparseIntArray f16118b = new SparseIntArray(1);

            /* renamed from: c  reason: collision with root package name */
            public final v f16119c;

            public C0075a(v vVar) {
                this.f16119c = vVar;
            }

            @Override // androidx.recyclerview.widget.g0.c
            public int a(int i10) {
                int indexOfKey = this.f16118b.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return this.f16118b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i10 + " does not belong to the adapter:" + this.f16119c.f16341c);
            }

            @Override // androidx.recyclerview.widget.g0.c
            public int b(int i10) {
                int indexOfKey = this.f16117a.indexOfKey(i10);
                if (indexOfKey > -1) {
                    return this.f16117a.valueAt(indexOfKey);
                }
                int c10 = a.this.c(this.f16119c);
                this.f16117a.put(i10, c10);
                this.f16118b.put(c10, i10);
                return c10;
            }

            @Override // androidx.recyclerview.widget.g0.c
            public void dispose() {
                a.this.d(this.f16119c);
            }
        }

        @Override // androidx.recyclerview.widget.g0
        public v a(int i10) {
            v vVar = this.f16115a.get(i10);
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.g0
        public c b(v vVar) {
            return new C0075a(vVar);
        }

        public int c(v vVar) {
            int i10 = this.f16116b;
            this.f16116b = i10 + 1;
            this.f16115a.put(i10, vVar);
            return i10;
        }

        public void d(v vVar) {
            for (int size = this.f16115a.size() - 1; size >= 0; size--) {
                if (this.f16115a.valueAt(size) == vVar) {
                    this.f16115a.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<List<v>> f16121a = new SparseArray<>();

        /* loaded from: classes.dex */
        public class a implements c {

            /* renamed from: a  reason: collision with root package name */
            public final v f16122a;

            public a(v vVar) {
                this.f16122a = vVar;
            }

            @Override // androidx.recyclerview.widget.g0.c
            public int a(int i10) {
                return i10;
            }

            @Override // androidx.recyclerview.widget.g0.c
            public int b(int i10) {
                List<v> list = b.this.f16121a.get(i10);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.f16121a.put(i10, list);
                }
                if (!list.contains(this.f16122a)) {
                    list.add(this.f16122a);
                }
                return i10;
            }

            @Override // androidx.recyclerview.widget.g0.c
            public void dispose() {
                b.this.c(this.f16122a);
            }
        }

        @Override // androidx.recyclerview.widget.g0
        public v a(int i10) {
            List<v> list = this.f16121a.get(i10);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        @Override // androidx.recyclerview.widget.g0
        public c b(v vVar) {
            return new a(vVar);
        }

        public void c(v vVar) {
            for (int size = this.f16121a.size() - 1; size >= 0; size--) {
                List<v> valueAt = this.f16121a.valueAt(size);
                if (valueAt.remove(vVar) && valueAt.isEmpty()) {
                    this.f16121a.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(int i10);

        int b(int i10);

        void dispose();
    }

    v a(int i10);

    c b(v vVar);
}
