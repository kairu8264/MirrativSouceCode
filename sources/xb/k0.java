package xb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import hf.v0;
import java.util.HashMap;
import java.util.List;
import oq.a;

/* loaded from: classes2.dex */
public final class k0 extends ArrayAdapter<UserBasicWithGraphParams> implements oq.a {
    public LayoutInflater A;
    public int B;

    /* renamed from: w  reason: collision with root package name */
    public final List<UserBasicWithGraphParams> f59922w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f59923x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, String> f59924y;

    /* renamed from: z  reason: collision with root package name */
    public Context f59925z;

    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f59926a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f59927b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f59928c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f59929d;

        /* renamed from: e  reason: collision with root package name */
        public Button f59930e;

        public a() {
        }

        public final Button a() {
            return this.f59930e;
        }

        public final TextView b() {
            return this.f59928c;
        }

        public final ImageView c() {
            return this.f59926a;
        }

        public final ImageView d() {
            return this.f59929d;
        }

        public final TextView e() {
            return this.f59927b;
        }

        public final void f(Button button) {
            this.f59930e = button;
        }

        public final void g(TextView textView) {
            this.f59928c = textView;
        }

        public final void h(ImageView imageView) {
            this.f59926a = imageView;
        }

        public final void i(ImageView imageView) {
            this.f59929d = imageView;
        }

        public final void j(TextView textView) {
            this.f59927b = textView;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f59932w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f59933x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f59934y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f59932w = aVar;
            this.f59933x = aVar2;
            this.f59934y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f59932w;
            vq.a aVar2 = this.f59933x;
            io.a<? extends uq.a> aVar3 = this.f59934y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(v0.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(Context context, int i10, List<? extends UserBasicWithGraphParams> list) {
        super(context, i10, list);
        jo.p.h(context, "context");
        jo.p.h(list, "mItems");
        this.f59922w = list;
        this.f59923x = wn.g.b(cr.a.f28611a.b(), new b(this, null, null));
        g(context, i10);
    }

    public static final void d(int i10, UserBasicWithGraphParams userBasicWithGraphParams, View view) {
        jo.p.h(userBasicWithGraphParams, "$item");
        dq.c.c().l(new nd.f(i10, userBasicWithGraphParams.getUserId(), !userBasicWithGraphParams.isBlocking()));
    }

    public static final void f(int i10, UserBasicWithGraphParams userBasicWithGraphParams, View view) {
        jo.p.h(userBasicWithGraphParams, "$item");
        dq.c.c().l(new nd.f(i10, userBasicWithGraphParams.getUserId(), !userBasicWithGraphParams.isBlocking()));
    }

    public final v0 c() {
        return (v0) this.f59923x.getValue();
    }

    public final void g(Context context, int i10) {
        this.f59925z = context;
        this.B = i10;
        jo.p.e(context);
        Object systemService = context.getSystemService("layout_inflater");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.A = (LayoutInflater) systemService;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(final int i10, View view, ViewGroup viewGroup) {
        a aVar;
        jo.p.h(viewGroup, "parent");
        if (view != null) {
            Object tag = view.getTag();
            jo.p.f(tag, "null cannot be cast to non-null type com.dena.mirrativ.streaming.ViewerListAdapter.ViewHolder");
            aVar = (a) tag;
        } else {
            LayoutInflater layoutInflater = this.A;
            jo.p.e(layoutInflater);
            view = layoutInflater.inflate(this.B, (ViewGroup) null);
            a aVar2 = new a();
            aVar2.h((ImageView) view.findViewById(o.f60060z4));
            aVar2.j((TextView) view.findViewById(o.f59992ia));
            aVar2.g((TextView) view.findViewById(o.f59997k2));
            aVar2.f((Button) view.findViewById(o.block));
            aVar2.i((ImageView) view.findViewById(o.unblock));
            view.setTag(aVar2);
            aVar = aVar2;
        }
        final UserBasicWithGraphParams userBasicWithGraphParams = this.f59922w.get(i10);
        TextView e10 = aVar.e();
        jo.p.e(e10);
        e10.setText(userBasicWithGraphParams.getName());
        HashMap<String, String> hashMap = this.f59924y;
        String str = "";
        if (hashMap != null) {
            jo.p.e(hashMap);
            String str2 = hashMap.get(userBasicWithGraphParams.getUserId());
            if (str2 != null) {
                str = str2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            TextView b10 = aVar.b();
            jo.p.e(b10);
            b10.setVisibility(8);
        } else {
            TextView b11 = aVar.b();
            jo.p.e(b11);
            b11.setVisibility(0);
            TextView b12 = aVar.b();
            jo.p.e(b12);
            b12.setText(str);
        }
        ImageView c10 = aVar.c();
        jo.p.e(c10);
        td.a.i(c10, userBasicWithGraphParams.getProfileImageUrl());
        if (c().i(userBasicWithGraphParams.getUserId())) {
            Button a10 = aVar.a();
            jo.p.e(a10);
            a10.setVisibility(8);
            ImageView d10 = aVar.d();
            jo.p.e(d10);
            d10.setVisibility(8);
        } else if (userBasicWithGraphParams.isBlocking()) {
            ImageView d11 = aVar.d();
            jo.p.e(d11);
            d11.setVisibility(0);
            Button a11 = aVar.a();
            jo.p.e(a11);
            a11.setVisibility(8);
        } else {
            ImageView d12 = aVar.d();
            jo.p.e(d12);
            d12.setVisibility(8);
            Button a12 = aVar.a();
            jo.p.e(a12);
            a12.setVisibility(0);
        }
        Button a13 = aVar.a();
        jo.p.e(a13);
        a13.setOnClickListener(new View.OnClickListener() { // from class: xb.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k0.d(i10, userBasicWithGraphParams, view2);
            }
        });
        ImageView d13 = aVar.d();
        jo.p.e(d13);
        d13.setOnClickListener(new View.OnClickListener() { // from class: xb.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k0.f(i10, userBasicWithGraphParams, view2);
            }
        });
        jo.p.e(view);
        return view;
    }

    public final void h(HashMap<String, String> hashMap) {
        this.f59924y = hashMap;
    }
}
