package j5;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f37113a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    public DataSetObserver f37114b;

    public abstract void a(ViewGroup viewGroup, int i10, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public abstract CharSequence e(int i10);

    public float f(int i10) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i10);

    public abstract boolean h(View view, Object obj);

    public void i() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f37114b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f37113a.notifyChanged();
    }

    public void j(DataSetObserver dataSetObserver) {
        this.f37113a.registerObserver(dataSetObserver);
    }

    public abstract void k(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable l();

    public abstract void m(ViewGroup viewGroup, int i10, Object obj);

    public void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f37114b = dataSetObserver;
        }
    }

    public abstract void o(ViewGroup viewGroup);

    public void p(DataSetObserver dataSetObserver) {
        this.f37113a.unregisterObserver(dataSetObserver);
    }
}
