package com.dena.mirrorman.webrtc;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.webrtc.RTCManager$sendMessage$1", f = "RTCManager.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RTCManager$sendMessage$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ RTCClient $client;
    public final /* synthetic */ String $message;
    public int label;
    public final /* synthetic */ RTCManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCManager$sendMessage$1(RTCManager rTCManager, RTCClient rTCClient, String str, d<? super RTCManager$sendMessage$1> dVar) {
        super(2, dVar);
        this.this$0 = rTCManager;
        this.$client = rTCClient;
        this.$message = str;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new RTCManager$sendMessage$1(this.this$0, this.$client, this.$message, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((RTCManager$sendMessage$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        MRRequest request;
        String str;
        String str2;
        Object c10 = c.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                m.b(obj);
                request = this.this$0.getRequest();
                str = this.this$0.referer;
                str2 = this.this$0.liveId;
                String userId = this.$client.getUserId();
                String str3 = this.$message;
                this.label = 1;
                if (request.postCollabSendToPeer(str, str2, userId, str3, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            g9.a.g("RTC Send success message:" + this.$message);
        } catch (Exception e10) {
            g9.a aVar = g9.a.f32826a;
            aVar.b("RTC Send message : failed : " + e10.getMessage(), new Object[0]);
        }
        return v.f59242a;
    }
}
