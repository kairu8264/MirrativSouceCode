package com.dena.mirrorman.customview;

import ae.wm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.StreamerAppUserIdView;
import jo.h;
import jo.p;
import nd.b1;
import nd.f1;
import wn.v;

/* loaded from: classes2.dex */
public final class StreamerAppUserIdView extends FrameLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final a f25606y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f25607z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final wm f25608w;

    /* renamed from: x  reason: collision with root package name */
    public io.a<v> f25609x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final void a(StreamerAppUserIdView streamerAppUserIdView, String str) {
            p.h(streamerAppUserIdView, "<this>");
            streamerAppUserIdView.f25608w.C.setText(str);
        }

        public final void b(StreamerAppUserIdView streamerAppUserIdView, String str) {
            p.h(streamerAppUserIdView, "<this>");
            streamerAppUserIdView.f25608w.D.setText(str);
            streamerAppUserIdView.f25608w.B.setText(streamerAppUserIdView.getResources().getString(f1.text_copy));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamerAppUserIdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ StreamerAppUserIdView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(StreamerAppUserIdView streamerAppUserIdView, View view) {
        p.h(streamerAppUserIdView, "this$0");
        io.a<v> aVar = streamerAppUserIdView.f25609x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void d(StreamerAppUserIdView streamerAppUserIdView, String str) {
        f25606y.a(streamerAppUserIdView, str);
    }

    public static final void e(StreamerAppUserIdView streamerAppUserIdView, String str) {
        f25606y.b(streamerAppUserIdView, str);
    }

    public final io.a<v> getClickedCopyAppUserIdButtonListener() {
        return this.f25609x;
    }

    public final void setClickedCopyAppUserIdButtonListener(io.a<v> aVar) {
        this.f25609x = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerAppUserIdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        wm wmVar = (wm) f.e(LayoutInflater.from(getContext()), b1.view_streamer_app_user_id, this, true);
        wmVar.B.setOnClickListener(new View.OnClickListener() { // from class: yd.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamerAppUserIdView.c(StreamerAppUserIdView.this, view);
            }
        });
        this.f25608w = wmVar;
    }
}
