package com.dena.mirrorman.webrtc;

import android.content.Context;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.webrtc.RTCClient;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import dq.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import jo.h;
import jo.p;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import pd.g;
import pd.t0;
import uo.g1;
import uo.j;
import uo.r0;
import wn.f;
import wn.g;
import wn.q;
import xn.s;

/* loaded from: classes3.dex */
public final class RTCManager implements oq.a, RTCClient.RTCClientListener {
    public static final int REJECT_TIME = 300000;
    private final f audioManager$delegate;
    private final String channelName;
    private final HashMap<String, RTCClient> clients;
    private final Context context;
    private final f dispatcher$delegate;
    private final f factory$delegate;
    private final String liveId;
    private final String liveOwnerName;
    private final String liveOwnerUserId;
    private final f logger$delegate;
    private final String referer;
    private final HashMap<String, Long> rejectUsers;
    private final f request$delegate;
    private final List<StunServer> stunServers;
    private final List<TurnServer> turnServers;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
            iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 1;
            iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 2;
            iArr[PeerConnection.IceConnectionState.CLOSED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RTCManager(String str, Context context, String str2, String str3, String str4, String str5, List<StunServer> list, List<TurnServer> list2) {
        p.h(str, "channelName");
        p.h(context, "context");
        p.h(str2, "referer");
        p.h(str3, "liveId");
        p.h(str4, "liveOwnerName");
        p.h(str5, "liveOwnerUserId");
        this.channelName = str;
        this.context = context;
        this.referer = str2;
        this.liveId = str3;
        this.liveOwnerName = str4;
        this.liveOwnerUserId = str5;
        this.stunServers = list;
        this.turnServers = list2;
        this.clients = new HashMap<>();
        this.rejectUsers = new HashMap<>();
        this.audioManager$delegate = g.a(new RTCManager$audioManager$2(this));
        this.factory$delegate = g.a(new RTCManager$factory$2(this));
        cr.a aVar = cr.a.f28611a;
        this.dispatcher$delegate = g.b(aVar.b(), new RTCManager$special$$inlined$inject$default$1(this, null, null));
        this.logger$delegate = g.b(aVar.b(), new RTCManager$special$$inlined$inject$default$2(this, null, null));
        this.request$delegate = g.b(aVar.b(), new RTCManager$special$$inlined$inject$default$3(this, null, null));
        getDispatcher().b(this);
    }

    public static /* synthetic */ void close$default(RTCManager rTCManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        rTCManager.close(z10);
    }

    private final RTCClient createReceiver(String str) {
        RTCClient rTCClient = this.clients.get(str);
        if (rTCClient != null) {
            rTCClient.close();
        }
        PeerConnectionFactory factory = getFactory();
        List<StunServer> list = this.stunServers;
        if (list == null) {
            list = s.k();
        }
        List<StunServer> list2 = list;
        List<TurnServer> list3 = this.turnServers;
        if (list3 == null) {
            list3 = s.k();
        }
        RTCClient rTCClient2 = new RTCClient(str, false, factory, list2, list3, this);
        this.clients.put(str, rTCClient2);
        return rTCClient2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RTCAudioManager getAudioManager() {
        return (RTCAudioManager) this.audioManager$delegate.getValue();
    }

    private final q8.a getDispatcher() {
        return (q8.a) this.dispatcher$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PeerConnectionFactory getFactory() {
        Object value = this.factory$delegate.getValue();
        p.g(value, "<get-factory>(...)");
        return (PeerConnectionFactory) value;
    }

    private final MRLogger getLogger() {
        return (MRLogger) this.logger$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRRequest getRequest() {
        return (MRRequest) this.request$delegate.getValue();
    }

    @Override // com.dena.mirrorman.webrtc.RTCClient.RTCClientListener
    public void changeICEState(RTCClient rTCClient, PeerConnection.IceConnectionState iceConnectionState) {
        p.h(rTCClient, "client");
        p.h(iceConnectionState, "state");
        g9.a.g("RTCClient Receive ICEState change " + iceConnectionState + " UserId " + rTCClient + ".userId");
        int i10 = WhenMappings.$EnumSwitchMapping$0[iceConnectionState.ordinal()];
        if (i10 == 1) {
            getDispatcher().a(new t0.a(this.channelName, rTCClient.getUserId()));
        } else if (i10 == 2 || i10 == 3) {
            disconnect(rTCClient.getUserId());
            getDispatcher().a(new t0.b(this.channelName, rTCClient.getUserId(), iceConnectionState));
        }
    }

    @Override // com.dena.mirrorman.webrtc.RTCClient.RTCClientListener
    public void changeSignalingState(RTCClient rTCClient, PeerConnection.SignalingState signalingState) {
        p.h(rTCClient, "client");
        p.h(signalingState, "state");
    }

    public final void close(boolean z10) {
        j.d(r0.a(g1.b()), null, null, new RTCManager$close$1(this, z10, null), 3, null);
        getDispatcher().c(this);
    }

    public final void createInitiator(String str) {
        p.h(str, "userId");
        RTCClient rTCClient = this.clients.get(str);
        if (rTCClient != null) {
            rTCClient.close();
        }
        PeerConnectionFactory factory = getFactory();
        List<StunServer> list = this.stunServers;
        if (list == null) {
            list = s.k();
        }
        List<StunServer> list2 = list;
        List<TurnServer> list3 = this.turnServers;
        if (list3 == null) {
            list3 = s.k();
        }
        RTCClient rTCClient2 = new RTCClient(str, true, factory, list2, list3, this);
        this.clients.put(str, rTCClient2);
        rTCClient2.createOffer();
    }

    public final void createPeerReceiver(String str) {
        p.h(str, "userId");
        g9.a.g("COLLAB createPeerReceiver " + str);
        createReceiver(str).sendPeerAccept();
    }

    public final void disconnect(String str) {
        p.h(str, "userId");
        RTCClient rTCClient = this.clients.get(str);
        if (rTCClient != null) {
            j.d(r0.a(g1.b()), null, null, new RTCManager$disconnect$1(rTCClient, null), 3, null);
            synchronized (this.clients) {
                this.clients.remove(str);
            }
        }
    }

    public final HashMap<String, RTCClient> getClients() {
        return this.clients;
    }

    public final int getConnectedClientNum() {
        Collection<RTCClient> values = this.clients.values();
        p.g(values, "clients.values");
        int i10 = 0;
        if (!values.isEmpty()) {
            for (RTCClient rTCClient : values) {
                if (rTCClient.isConnected() && (i10 = i10 + 1) < 0) {
                    s.s();
                }
            }
        }
        return i10;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final boolean hasClient(String str) {
        p.h(str, "userId");
        return this.clients.get(str) != null;
    }

    public final boolean hasClients() {
        return !this.clients.isEmpty();
    }

    public final boolean isConnected(String str) {
        p.h(str, "userId");
        RTCClient rTCClient = this.clients.get(str);
        if (rTCClient == null) {
            return false;
        }
        return rTCClient.isConnected();
    }

    public final boolean isRejectUser(String str) {
        p.h(str, "userId");
        Long l10 = this.rejectUsers.get(str);
        return l10 != null && System.currentTimeMillis() - l10.longValue() < DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(g.b bVar) {
        p.h(bVar, "event");
        disconnect(bVar.a());
    }

    @Override // com.dena.mirrorman.webrtc.RTCClient.RTCClientListener
    public void onAction(RTCClient rTCClient, RTCActionType rTCActionType, String str) {
        p.h(rTCClient, "client");
        p.h(rTCActionType, "actionType");
        p.h(str, "targetDetail");
        String str2 = rTCClient.isInitiator() ? "initiator" : "receiver";
        MRLogger logger = getLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(rTCActionType.getRawValue());
        builder.setTargetType(MRLog.TARGET_TYPE_USER);
        builder.setTargetId(rTCClient.getUserId());
        builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_LIVE_ID, this.liveId), q.a(MRLog.PAYLOAD_KEY_WHERE, str2), q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str)));
        logger.sendLog(builder.build());
    }

    @Override // com.dena.mirrorman.webrtc.RTCClient.RTCClientListener
    public void onError(RTCClient rTCClient, String str) {
        p.h(rTCClient, "client");
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        g9.a aVar = g9.a.f32826a;
        aVar.b("RTC ERROR: " + this.liveOwnerName + ' ' + this.liveOwnerUserId + ' ' + str, new Object[0]);
        Puree.d(new Live.CollabError(this.liveOwnerName, this.liveOwnerUserId, str));
    }

    public final void receiveMessage(String str, String str2) {
        p.h(str, "userId");
        p.h(str2, "message");
        try {
            String optString = new JSONObject(str2).optString("type");
            if (!this.clients.containsKey(str)) {
                createReceiver(str);
            }
            RTCClient rTCClient = this.clients.get(str);
            if (!p.c(optString, "peer_accept")) {
                if (rTCClient != null) {
                    rTCClient.receiveMessage(str2);
                    return;
                }
                return;
            }
            g9.a.g("COLLAB PEER CONNECTION INITIATOR START " + str);
            createInitiator(str);
        } catch (JSONException e10) {
            MRLogger logger = getLogger();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(RTCActionType.SIGNALING_MESSAGE_ERROR.getRawValue());
            builder.setTargetType(MRLog.TARGET_TYPE_USER);
            builder.setTargetId(str);
            builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_LIVE_ID, this.liveId), q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str2), q.a(MRLog.PAYLOAD_KEY_ERROR, e10.getLocalizedMessage())));
            logger.sendLog(builder.build());
            g9.a aVar = g9.a.f32826a;
            aVar.b("json invalid failed " + e10.getLocalizedMessage(), new Object[0]);
        }
    }

    public final void rejectUser(String str) {
        p.h(str, "userId");
        this.rejectUsers.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.dena.mirrorman.webrtc.RTCClient.RTCClientListener
    public void sendMessage(RTCClient rTCClient, String str) {
        p.h(rTCClient, "client");
        p.h(str, "message");
        j.d(r0.a(g1.b()), null, null, new RTCManager$sendMessage$1(this, rTCClient, str, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(g.a aVar) {
        p.h(aVar, "event");
        disconnect(aVar.a());
    }
}
