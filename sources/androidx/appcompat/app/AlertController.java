package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import d.j;
import java.lang.ref.WeakReference;
import o3.c0;

/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14100a;

    /* renamed from: b  reason: collision with root package name */
    public final e.f f14101b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f14102c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14103d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f14104e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f14105f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f14106g;

    /* renamed from: h  reason: collision with root package name */
    public View f14107h;

    /* renamed from: i  reason: collision with root package name */
    public int f14108i;

    /* renamed from: j  reason: collision with root package name */
    public int f14109j;

    /* renamed from: k  reason: collision with root package name */
    public int f14110k;

    /* renamed from: l  reason: collision with root package name */
    public int f14111l;

    /* renamed from: m  reason: collision with root package name */
    public int f14112m;

    /* renamed from: o  reason: collision with root package name */
    public Button f14114o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f14115p;

    /* renamed from: q  reason: collision with root package name */
    public Message f14116q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f14117r;

    /* renamed from: s  reason: collision with root package name */
    public Button f14118s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f14119t;

    /* renamed from: u  reason: collision with root package name */
    public Message f14120u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f14121v;

    /* renamed from: w  reason: collision with root package name */
    public Button f14122w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f14123x;

    /* renamed from: y  reason: collision with root package name */
    public Message f14124y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f14125z;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14113n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: w  reason: collision with root package name */
        public final int f14126w;

        /* renamed from: x  reason: collision with root package name */
        public final int f14127x;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f28808e2);
            this.f14127x = obtainStyledAttributes.getDimensionPixelOffset(j.f28813f2, -1);
            this.f14126w = obtainStyledAttributes.getDimensionPixelOffset(j.f28818g2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f14126w, getPaddingRight(), z11 ? getPaddingBottom() : this.f14127x);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f14114o && (message3 = alertController.f14116q) != null) {
                obtain = Message.obtain(message3);
            } else if (view == alertController.f14118s && (message2 = alertController.f14120u) != null) {
                obtain = Message.obtain(message2);
            } else {
                obtain = (view != alertController.f14122w || (message = alertController.f14124y) == null) ? null : Message.obtain(message);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f14101b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f14129a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f14130b;

        public b(View view, View view2) {
            this.f14129a = view;
            this.f14130b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f14129a, this.f14130b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f14132w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f14133x;

        public c(View view, View view2) {
            this.f14132w = view;
            this.f14133x = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f14132w, this.f14133x);
        }
    }

    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f14135w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f14136x;

        public d(View view, View view2) {
            this.f14135w = view;
            this.f14136x = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f14135w, this.f14136x);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f14138w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ View f14139x;

        public e(View view, View view2) {
            this.f14138w = view;
            this.f14139x = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f14106g, this.f14138w, this.f14139x);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f14141a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f14142b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f14144d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f14146f;

        /* renamed from: g  reason: collision with root package name */
        public View f14147g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f14148h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f14149i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f14150j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f14151k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f14152l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f14153m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f14154n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f14155o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f14156p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f14157q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f14159s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f14160t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f14161u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f14162v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f14163w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f14164x;

        /* renamed from: y  reason: collision with root package name */
        public int f14165y;

        /* renamed from: z  reason: collision with root package name */
        public View f14166z;

        /* renamed from: c  reason: collision with root package name */
        public int f14143c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f14145e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f14158r = true;

        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f14167w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f14167w = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f14167w.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: w  reason: collision with root package name */
            public final int f14169w;

            /* renamed from: x  reason: collision with root package name */
            public final int f14170x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f14171y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ AlertController f14172z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f14171y = recycleListView;
                this.f14172z = alertController;
                Cursor cursor2 = getCursor();
                this.f14169w = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f14170x = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f14169w));
                this.f14171y.setItemChecked(cursor.getPosition(), cursor.getInt(this.f14170x) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f14142b.inflate(this.f14172z.M, viewGroup, false);
            }
        }

        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ AlertController f14173w;

            public c(AlertController alertController) {
                this.f14173w = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f14164x.onClick(this.f14173w.f14101b, i10);
                if (f.this.H) {
                    return;
                }
                this.f14173w.f14101b.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f14175w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ AlertController f14176x;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f14175w = recycleListView;
                this.f14176x = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f14175w.isItemChecked(i10);
                }
                f.this.J.onClick(this.f14176x.f14101b, i10, this.f14175w.isItemChecked(i10));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f14141a = context;
            this.f14142b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f14147g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f14146f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f14144d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f14143c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f14145e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f14148h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f14149i;
            if (charSequence3 != null || this.f14150j != null) {
                alertController.k(-1, charSequence3, this.f14151k, null, this.f14150j);
            }
            CharSequence charSequence4 = this.f14152l;
            if (charSequence4 != null || this.f14153m != null) {
                alertController.k(-2, charSequence4, this.f14154n, null, this.f14153m);
            }
            CharSequence charSequence5 = this.f14155o;
            if (charSequence5 != null || this.f14156p != null) {
                alertController.k(-3, charSequence5, this.f14157q, null, this.f14156p);
            }
            if (this.f14162v != null || this.K != null || this.f14163w != null) {
                b(alertController);
            }
            View view2 = this.f14166z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f14165y;
            if (i12 != 0) {
                alertController.r(i12);
            }
        }

        public final void b(AlertController alertController) {
            int i10;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f14142b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                if (this.K == null) {
                    listAdapter = new a(this.f14141a, alertController.M, 16908308, this.f14162v, recycleListView);
                } else {
                    listAdapter = new b(this.f14141a, this.K, false, recycleListView, alertController);
                }
            } else {
                if (this.H) {
                    i10 = alertController.N;
                } else {
                    i10 = alertController.O;
                }
                int i11 = i10;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f14141a, i11, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.f14163w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f14141a, i11, 16908308, this.f14162v);
                    }
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f14164x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f14106g = recycleListView;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f14178a;

        public g(DialogInterface dialogInterface) {
            this.f14178a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f14178a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, e.f fVar, Window window) {
        this.f14100a = context;
        this.f14101b = fVar;
        this.f14102c = window;
        this.R = new g(fVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.H, d.a.f28642p, 0);
        this.J = obtainStyledAttributes.getResourceId(j.I, 0);
        this.K = obtainStyledAttributes.getResourceId(j.K, 0);
        this.L = obtainStyledAttributes.getResourceId(j.M, 0);
        this.M = obtainStyledAttributes.getResourceId(j.N, 0);
        this.N = obtainStyledAttributes.getResourceId(j.P, 0);
        this.O = obtainStyledAttributes.getResourceId(j.L, 0);
        this.P = obtainStyledAttributes.getBoolean(j.O, true);
        this.f14103d = obtainStyledAttributes.getDimensionPixelSize(j.J, 0);
        obtainStyledAttributes.recycle();
        fVar.d(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f28640o, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f14100a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f14106g;
    }

    public void e() {
        this.f14101b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.k(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.k(keyEvent);
    }

    public final ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int j() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i10 : this.J;
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f14123x = charSequence;
            this.f14124y = message;
            this.f14125z = drawable;
        } else if (i10 == -2) {
            this.f14119t = charSequence;
            this.f14120u = message;
            this.f14121v = drawable;
        } else if (i10 == -1) {
            this.f14115p = charSequence;
            this.f14116q = message;
            this.f14117r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void o(CharSequence charSequence) {
        this.f14105f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f14102c.findViewById(d.f.B);
        View findViewById2 = this.f14102c.findViewById(d.f.A);
        if (Build.VERSION.SDK_INT >= 23) {
            c0.J0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f14105f != null) {
            this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
            this.A.post(new c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f14106g;
        if (listView != null) {
            listView.setOnScrollListener(new d(findViewById, findViewById2));
            this.f14106g.post(new e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void q(CharSequence charSequence) {
        this.f14104e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f14107h = null;
        this.f14108i = i10;
        this.f14113n = false;
    }

    public void s(View view) {
        this.f14107h = view;
        this.f14108i = 0;
        this.f14113n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f14107h = view;
        this.f14108i = 0;
        this.f14113n = true;
        this.f14109j = i10;
        this.f14110k = i11;
        this.f14111l = i12;
        this.f14112m = i13;
    }

    public final void u(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f14114o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f14115p) && this.f14117r == null) {
            this.f14114o.setVisibility(8);
            z10 = false;
        } else {
            this.f14114o.setText(this.f14115p);
            Drawable drawable = this.f14117r;
            if (drawable != null) {
                int i10 = this.f14103d;
                drawable.setBounds(0, 0, i10, i10);
                this.f14114o.setCompoundDrawables(this.f14117r, null, null, null);
            }
            this.f14114o.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f14118s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f14119t) && this.f14121v == null) {
            this.f14118s.setVisibility(8);
        } else {
            this.f14118s.setText(this.f14119t);
            Drawable drawable2 = this.f14121v;
            if (drawable2 != null) {
                int i11 = this.f14103d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f14118s.setCompoundDrawables(this.f14121v, null, null, null);
            }
            this.f14118s.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f14122w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f14123x) && this.f14125z == null) {
            this.f14122w.setVisibility(8);
        } else {
            this.f14122w.setText(this.f14123x);
            Drawable drawable3 = this.f14125z;
            if (drawable3 != null) {
                int i12 = this.f14103d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f14122w.setCompoundDrawables(this.f14125z, null, null, null);
            }
            this.f14122w.setVisibility(0);
            z10 |= true;
        }
        if (z(this.f14100a)) {
            if (z10) {
                b(this.f14114o);
            } else if (z10) {
                b(this.f14118s);
            } else if (z10) {
                b(this.f14122w);
            }
        }
        if (z10) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f14102c.findViewById(d.f.C);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f14105f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f14106g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f14106g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void w(ViewGroup viewGroup) {
        View view = this.f14107h;
        if (view == null) {
            view = this.f14108i != 0 ? LayoutInflater.from(this.f14100a).inflate(this.f14108i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f14102c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f14102c.findViewById(d.f.f28728o);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f14113n) {
                frameLayout.setPadding(this.f14109j, this.f14110k, this.f14111l, this.f14112m);
            }
            if (this.f14106g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f14102c.findViewById(d.f.U).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f14102c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f14104e)) && this.P) {
            TextView textView = (TextView) this.f14102c.findViewById(d.f.f28724k);
            this.E = textView;
            textView.setText(this.f14104e);
            int i10 = this.B;
            if (i10 != 0) {
                this.D.setImageResource(i10);
                return;
            }
            Drawable drawable = this.C;
            if (drawable != null) {
                this.D.setImageDrawable(drawable);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.f14102c.findViewById(d.f.U).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f14102c.findViewById(d.f.f28739z);
        int i10 = d.f.V;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = d.f.f28727n;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = d.f.f28725l;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(d.f.f28729p);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i13 == null || i13.getVisibility() == 8) ? false : 1;
        boolean z12 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!z12 && i14 != null && (findViewById2 = i14.findViewById(d.f.Q)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f14105f != null || this.f14106g != null) {
                view = i13.findViewById(d.f.T);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i14 != null && (findViewById = i14.findViewById(d.f.R)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f14106g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f14106g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                p(i14, view2, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f14106g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i16 = this.I;
        if (i16 > -1) {
            listView2.setItemChecked(i16, true);
            listView2.setSelection(i16);
        }
    }
}
