package u6;

import a7.i;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: d  reason: collision with root package name */
    public final String f54535d;

    /* renamed from: f  reason: collision with root package name */
    public final a7.i f54537f;

    /* renamed from: a  reason: collision with root package name */
    public final Path f54532a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f54533b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f54534c = new Path();

    /* renamed from: e  reason: collision with root package name */
    public final List<m> f54536e = new ArrayList();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54538a;

        static {
            int[] iArr = new int[i.a.values().length];
            f54538a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54538a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54538a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54538a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54538a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(a7.i iVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f54535d = iVar.c();
            this.f54537f = iVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f54536e.size(); i10++) {
            this.f54534c.addPath(this.f54536e.get(i10).getPath());
        }
    }

    @TargetApi(19)
    public final void b(Path.Op op2) {
        this.f54533b.reset();
        this.f54532a.reset();
        for (int size = this.f54536e.size() - 1; size >= 1; size--) {
            m mVar = this.f54536e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> i10 = dVar.i();
                for (int size2 = i10.size() - 1; size2 >= 0; size2--) {
                    Path path = i10.get(size2).getPath();
                    path.transform(dVar.j());
                    this.f54533b.addPath(path);
                }
            } else {
                this.f54533b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f54536e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> i11 = dVar2.i();
            for (int i12 = 0; i12 < i11.size(); i12++) {
                Path path2 = i11.get(i12).getPath();
                path2.transform(dVar2.j());
                this.f54532a.addPath(path2);
            }
        } else {
            this.f54532a.set(mVar2.getPath());
        }
        this.f54534c.op(this.f54532a, this.f54533b, op2);
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f54536e.size(); i10++) {
            this.f54536e.get(i10).c(list, list2);
        }
    }

    @Override // u6.j
    public void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f54536e.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // u6.m
    public Path getPath() {
        this.f54534c.reset();
        if (this.f54537f.d()) {
            return this.f54534c;
        }
        int i10 = a.f54538a[this.f54537f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            b(Path.Op.UNION);
        } else if (i10 == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            b(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            b(Path.Op.XOR);
        }
        return this.f54534c;
    }
}
