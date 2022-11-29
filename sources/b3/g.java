package b3;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public b f16796a;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public static HandlerThread f16797e;

        /* renamed from: f  reason: collision with root package name */
        public static Handler f16798f;

        /* renamed from: a  reason: collision with root package name */
        public int f16799a;

        /* renamed from: b  reason: collision with root package name */
        public SparseIntArray[] f16800b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<WeakReference<Activity>> f16801c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f16802d = new Window$OnFrameMetricsAvailableListenerC0096a();

        /* renamed from: b3.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC0096a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC0096a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f16799a & 1) != 0) {
                    aVar.c(aVar.f16800b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f16799a & 2) != 0) {
                    aVar2.c(aVar2.f16800b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f16799a & 4) != 0) {
                    aVar3.c(aVar3.f16800b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f16799a & 8) != 0) {
                    aVar4.c(aVar4.f16800b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f16799a & 16) != 0) {
                    aVar5.c(aVar5.f16800b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f16799a & 64) != 0) {
                    aVar6.c(aVar6.f16800b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f16799a & 32) != 0) {
                    aVar7.c(aVar7.f16800b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f16799a & 128) != 0) {
                    aVar8.c(aVar8.f16800b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f16799a & 256) != 0) {
                    aVar9.c(aVar9.f16800b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i10) {
            this.f16799a = i10;
        }

        @Override // b3.g.b
        public void a(Activity activity) {
            if (f16797e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f16797e = handlerThread;
                handlerThread.start();
                f16798f = new Handler(f16797e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f16800b;
                if (sparseIntArrayArr[i10] == null && (this.f16799a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f16802d, f16798f);
            this.f16801c.add(new WeakReference<>(activity));
        }

        @Override // b3.g.b
        public SparseIntArray[] b() {
            SparseIntArray[] sparseIntArrayArr = this.f16800b;
            this.f16800b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        public void c(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }
    }

    public g() {
        this(1);
    }

    public void a(Activity activity) {
        this.f16796a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f16796a.b();
    }

    public g(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16796a = new a(i10);
        } else {
            this.f16796a = new b();
        }
    }
}
