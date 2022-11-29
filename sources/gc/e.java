package gc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.widget.SettingButtonView;
import com.dena.mirrorman.widget.SettingSwitchView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32904a;

    /* renamed from: b  reason: collision with root package name */
    public final List<gc.c> f32905b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<SettingButtonView, wn.v> f32906c;

    /* renamed from: d  reason: collision with root package name */
    public final io.p<SettingSwitchView, Boolean, wn.v> f32907d;

    /* renamed from: e  reason: collision with root package name */
    public final io.l<View, wn.v> f32908e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f32909f;

    /* renamed from: g  reason: collision with root package name */
    public String f32910g;

    /* renamed from: h  reason: collision with root package name */
    public ye.c f32911h;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32912a;

        static {
            int[] iArr = new int[gc.a.values().length];
            iArr[gc.a.SWITCH.ordinal()] = 1;
            iArr[gc.a.BUTTON.ordinal()] = 2;
            iArr[gc.a.THUMBNAIL.ordinal()] = 3;
            f32912a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<SettingSwitchView, Boolean, wn.v> {
        public b() {
            super(2);
        }

        public final void a(SettingSwitchView settingSwitchView, boolean z10) {
            jo.p.h(settingSwitchView, "view");
            if (e.this.f32909f) {
                return;
            }
            e.this.f32907d.invoke(settingSwitchView, Boolean.valueOf(z10));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(SettingSwitchView settingSwitchView, Boolean bool) {
            a(settingSwitchView, bool.booleanValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<SettingButtonView, wn.v> {
        public c() {
            super(1);
        }

        public final void a(SettingButtonView settingButtonView) {
            jo.p.h(settingButtonView, "view");
            e.this.f32906c.invoke(settingButtonView);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(SettingButtonView settingButtonView) {
            a(settingButtonView);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, List<gc.c> list, io.l<? super SettingButtonView, wn.v> lVar, io.p<? super SettingSwitchView, ? super Boolean, wn.v> pVar, io.l<? super View, wn.v> lVar2) {
        jo.p.h(context, "context");
        jo.p.h(list, "list");
        jo.p.h(lVar, "onClickListener");
        jo.p.h(pVar, "onCheckedChangeListener");
        jo.p.h(lVar2, "onThumbnailButtonClickListener");
        this.f32904a = context;
        this.f32905b = list;
        this.f32906c = lVar;
        this.f32907d = pVar;
        this.f32908e = lVar2;
    }

    public static final void f(e eVar, View view) {
        jo.p.h(eVar, "this$0");
        io.l<View, wn.v> lVar = eVar.f32908e;
        jo.p.g(view, "it");
        lVar.invoke(view);
    }

    public final void g(String str) {
        this.f32910g = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f32905b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f32905b.get(i10).d().ordinal();
    }

    public final void h(ye.c cVar) {
        this.f32911h = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        this.f32909f = true;
        if (e0Var instanceof i0) {
            i0 i0Var = (i0) e0Var;
            i0Var.a(this.f32905b.get(i10));
            i0Var.b().B.setOnCheckedChangeListener(new b());
        } else if (e0Var instanceof v) {
            v vVar = (v) e0Var;
            ye.c cVar = this.f32911h;
            Context context = this.f32904a;
            jo.p.f(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            vVar.b(this.f32905b.get(i10), cVar, (androidx.lifecycle.u) context);
            vVar.d().B.setOnClickListener(new c());
        } else if (e0Var instanceof l0) {
            l0 l0Var = (l0) e0Var;
            l0Var.a(this.f32905b.get(i10), this.f32910g);
            l0Var.b().B.setOnClickListener(new View.OnClickListener() { // from class: gc.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.f(e.this, view);
                }
            });
        }
        this.f32909f = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        int i11 = a.f32912a[gc.a.values()[i10].ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return l0.f32993y.a(viewGroup);
                }
                throw new NoWhenBranchMatchedException();
            }
            return v.C.a(viewGroup);
        }
        return i0.f32957z.a(viewGroup);
    }
}
