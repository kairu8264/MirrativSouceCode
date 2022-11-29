package n1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f41434a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseLongArray f41435b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f41436c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public final List<z> f41437d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f41438e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f41439f = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f41435b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f41435b;
                long j10 = this.f41434a;
                this.f41434a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f41435b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f41435b;
            long j11 = this.f41434a;
            this.f41434a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f41436c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f41438e && source == this.f41439f) {
            return;
        }
        this.f41438e = toolType;
        this.f41439f = source;
        this.f41436c.clear();
        this.f41435b.clear();
    }

    public final y c(MotionEvent motionEvent, k0 k0Var) {
        int i10;
        jo.p.h(motionEvent, "motionEvent");
        jo.p.h(k0Var, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f41435b.clear();
            this.f41436c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f41436c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i10 = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i10 = 0;
        }
        this.f41437d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i11 = 0;
        while (i11 < pointerCount) {
            this.f41437d.add(d(k0Var, motionEvent, i11, (z10 || i11 == i10 || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i11++;
        }
        h(motionEvent);
        return new y(motionEvent.getEventTime(), this.f41437d, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n1.z d(n1.k0 r24, android.view.MotionEvent r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.d(n1.k0, android.view.MotionEvent, int, boolean):n1.z");
    }

    public final void e(int i10) {
        this.f41436c.delete(i10);
        this.f41435b.delete(i10);
    }

    public final long f(int i10) {
        long j10;
        int indexOfKey = this.f41435b.indexOfKey(i10);
        if (indexOfKey >= 0) {
            j10 = this.f41435b.valueAt(indexOfKey);
        } else {
            j10 = this.f41434a;
            this.f41434a = 1 + j10;
            this.f41435b.put(i10, j10);
        }
        return v.b(j10);
    }

    public final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    public final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f41436c.get(pointerId, false)) {
                this.f41435b.delete(pointerId);
                this.f41436c.delete(pointerId);
            }
        }
        if (this.f41435b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f41435b.size() - 1; -1 < size; size--) {
                int keyAt = this.f41435b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.f41435b.removeAt(size);
                    this.f41436c.delete(keyAt);
                }
            }
        }
    }
}
