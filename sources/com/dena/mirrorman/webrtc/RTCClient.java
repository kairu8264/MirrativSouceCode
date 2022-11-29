package com.dena.mirrorman.webrtc;

import android.util.Log;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import jo.h;
import jo.p;
import nd.i1;
import oq.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpReceiver;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import so.o;
import wn.f;
import wn.g;
import xn.a0;
import xn.x;

/* loaded from: classes3.dex */
public final class RTCClient implements PeerConnection.Observer, SdpObserver, oq.a {
    public static final int DEFAULT_VOLUME = -24;
    private final PeerConnectionFactory factory;
    private boolean isConnected;
    private final boolean isInitiator;
    private RTCClientListener mListener;
    private PeerConnection peerConnection;
    private List<MediaStream> remoteStreams;
    private final f sharedApplicationModel$delegate;
    private final Timer timer;
    private final String userId;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void jsonPut(JSONObject jSONObject, String str, Object obj) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class PingTimerTask extends TimerTask {
        public PingTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RTCClient.this.ping();
        }
    }

    /* loaded from: classes3.dex */
    public interface RTCClientListener {
        void changeICEState(RTCClient rTCClient, PeerConnection.IceConnectionState iceConnectionState);

        void changeSignalingState(RTCClient rTCClient, PeerConnection.SignalingState signalingState);

        void onAction(RTCClient rTCClient, RTCActionType rTCActionType, String str);

        void onError(RTCClient rTCClient, String str);

        void sendMessage(RTCClient rTCClient, String str);
    }

    /* loaded from: classes3.dex */
    public final class TurnServerInfo {
        private String pass;
        public final /* synthetic */ RTCClient this$0;
        private String url;
        private String user;

        public TurnServerInfo(RTCClient rTCClient, String str, String str2, String str3) {
            p.h(str, "url");
            this.this$0 = rTCClient;
            this.url = str;
            this.user = str2;
            this.pass = str3;
        }

        public final void appendUrl(String str) {
            p.h(str, "appendUrl");
            if (vp.b.a(str)) {
                return;
            }
            if (vp.b.a(this.url)) {
                this.url = str;
                return;
            }
            this.url += ',' + str;
        }

        public final String getPass() {
            return this.pass;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getUser() {
            return this.user;
        }

        public final void setPass(String str) {
            this.pass = str;
        }

        public final void setUrl(String str) {
            p.h(str, "<set-?>");
            this.url = str;
        }

        public final void setUser(String str) {
            this.user = str;
        }
    }

    public RTCClient(String str, boolean z10, PeerConnectionFactory peerConnectionFactory, List<StunServer> list, List<TurnServer> list2, RTCClientListener rTCClientListener) {
        p.h(str, "userId");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        this.userId = str;
        this.isInitiator = z10;
        this.factory = peerConnectionFactory;
        this.mListener = rTCClientListener;
        this.sharedApplicationModel$delegate = g.b(cr.a.f28611a.b(), new RTCClient$special$$inlined$inject$default$1(this, null, null));
        Timer timer = new Timer();
        this.timer = timer;
        this.remoteStreams = new ArrayList();
        createPeerConnection(list, list2);
        if (z10) {
            return;
        }
        timer.schedule(new PingTimerTask(), DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS, DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
    }

    private final boolean containsTcpTransport(LinkedList<PeerConnection.IceServer> linkedList) {
        Iterator<PeerConnection.IceServer> it = linkedList.iterator();
        while (it.hasNext()) {
            for (String str : it.next().urls) {
                p.g(str, "string");
                if (o.H(str, "transport=tcp", false, 2, null)) {
                    g9.a.g(str);
                    return true;
                }
            }
        }
        return false;
    }

    private final AudioTrack createAudioTrack() {
        PeerConnectionFactory peerConnectionFactory = this.factory;
        AudioSource createAudioSource = peerConnectionFactory != null ? peerConnectionFactory.createAudioSource(createDefaultAudioMediaConstraints()) : null;
        PeerConnectionFactory peerConnectionFactory2 = this.factory;
        AudioTrack createAudioTrack = peerConnectionFactory2 != null ? peerConnectionFactory2.createAudioTrack("ARDAMSv0", createAudioSource) : null;
        if (createAudioTrack != null) {
            createAudioTrack.setEnabled(true);
        }
        return createAudioTrack;
    }

    private final MediaConstraints createDefaultAnswerMediaConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
        return mediaConstraints;
    }

    private final MediaConstraints createDefaultAudioMediaConstraints() {
        return new MediaConstraints();
    }

    private final MediaConstraints createDefaultOfferMediaConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "false"));
        return mediaConstraints;
    }

    private final MediaStream createLocalMediaStream() {
        PeerConnectionFactory peerConnectionFactory = this.factory;
        MediaStream createLocalMediaStream = peerConnectionFactory != null ? peerConnectionFactory.createLocalMediaStream("ARDAMS") : null;
        if (createLocalMediaStream != null) {
            createLocalMediaStream.addTrack(createAudioTrack());
        }
        return createLocalMediaStream;
    }

    private final void createPeerConnection(List<StunServer> list, List<TurnServer> list2) {
        String transport;
        LinkedList<PeerConnection.IceServer> linkedList = new LinkedList<>();
        for (StunServer stunServer : list) {
            g9.a.g("use stun server:" + stunServer.uriString());
            linkedList.add(new PeerConnection.IceServer(stunServer.uriString(), "", ""));
        }
        HashMap hashMap = new HashMap();
        for (TurnServer turnServer : list2) {
            if (turnServer.getTransport() == null) {
                transport = "";
            } else {
                transport = turnServer.getTransport();
                p.e(transport);
            }
            String str = turnServer.getUser() + turnServer.getPass() + transport;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new TurnServerInfo(this, turnServer.uriString(), turnServer.getUser(), turnServer.getPass()));
            } else {
                Object obj = hashMap.get(str);
                p.e(obj);
                ((TurnServerInfo) obj).appendUrl(turnServer.uriString());
            }
        }
        for (TurnServerInfo turnServerInfo : hashMap.values()) {
            g9.a.g("use turn server:" + turnServerInfo.getUrl());
            linkedList.add(new PeerConnection.IceServer(turnServerInfo.getUrl(), turnServerInfo.getUser(), turnServerInfo.getPass()));
        }
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(linkedList);
        if (containsTcpTransport(linkedList)) {
            rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        } else {
            rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
        }
        g9.a.f(rTCConfiguration.tcpCandidatePolicy);
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.PLAN_B;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.close();
        }
        PeerConnectionFactory peerConnectionFactory = this.factory;
        PeerConnection createPeerConnection = peerConnectionFactory != null ? peerConnectionFactory.createPeerConnection(rTCConfiguration, this) : null;
        this.peerConnection = createPeerConnection;
        if (createPeerConnection != null) {
            createPeerConnection.addStream(createLocalMediaStream());
        }
    }

    private final i1 getSharedApplicationModel() {
        return (i1) this.sharedApplicationModel$delegate.getValue();
    }

    private final void pong() {
        JSONObject jSONObject = new JSONObject();
        Companion.jsonPut(jSONObject, "type", "pong");
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            String jSONObject2 = jSONObject.toString();
            p.g(jSONObject2, "json.toString()");
            rTCClientListener.sendMessage(this, jSONObject2);
        }
    }

    private final IceCandidate toJavaCandidate(JSONObject jSONObject) throws JSONException {
        return new IceCandidate(jSONObject.getString(TtmlNode.ATTR_ID), jSONObject.getInt(LogBase.LABEL), jSONObject.getString("candidate"));
    }

    private final JSONObject toJsonCandidate(IceCandidate iceCandidate) {
        JSONObject jSONObject = new JSONObject();
        Companion companion = Companion;
        companion.jsonPut(jSONObject, "type", "candidate");
        companion.jsonPut(jSONObject, LogBase.LABEL, Integer.valueOf(iceCandidate.sdpMLineIndex));
        String str = iceCandidate.sdpMid;
        p.g(str, "candidate.sdpMid");
        companion.jsonPut(jSONObject, TtmlNode.ATTR_ID, str);
        String str2 = iceCandidate.sdp;
        p.g(str2, "candidate.sdp");
        companion.jsonPut(jSONObject, "candidate", str2);
        return jSONObject;
    }

    public final void changeVolume(int i10) {
        List<AudioTrack> list;
        AudioTrack audioTrack;
        MediaStream mediaStream = (MediaStream) a0.Z(this.remoteStreams);
        if (mediaStream == null || (list = mediaStream.audioTracks) == null || (audioTrack = (AudioTrack) a0.Z(list)) == null) {
            return;
        }
        double pow = Math.pow((i10 + 80.0d) / 80.0d, 2) * 4;
        g9.a.g("RTCClient changeVolume userId = " + this.userId + " decibel = " + i10 + " volume = " + pow);
        audioTrack.setVolume(pow);
    }

    public final synchronized void close() {
        if (this.peerConnection == null) {
            return;
        }
        Log.i("RTC", "Close Peer connection userId:" + this.userId);
        this.mListener = null;
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.dispose();
        }
        this.peerConnection = null;
        this.isConnected = false;
        this.timer.cancel();
    }

    public final void createOffer() {
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.createOffer(this, createDefaultOfferMediaConstraints());
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isInitiator() {
        return this.isInitiator;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        p.h(mediaStream, "stream");
        Log.i("RTC", "add stream");
        this.remoteStreams.add(mediaStream);
        if (getSharedApplicationModel().a().d()) {
            changeVolume(-24);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        p.h(rtpReceiver, "receiver");
        p.h(mediaStreamArr, "mediaStreams");
        Log.i("RTC", "add track");
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        p.h(str, MRLog.PAYLOAD_KEY_ERROR);
        g9.a aVar = g9.a.f32826a;
        aVar.b("COLLAB create failed " + str + ' ' + this.userId, new Object[0]);
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            rTCClientListener.onError(this, "COLLAB create failed " + str + ' ' + this.userId);
        }
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
        p.h(sessionDescription, "origSdp");
        Log.i("RTC", "SDP Create Success");
        SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, sessionDescription.description);
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            peerConnection.setLocalDescription(this, sessionDescription2);
        }
        SessionDescription.Type type = sessionDescription2.type;
        if (type == SessionDescription.Type.OFFER) {
            JSONObject jSONObject = new JSONObject();
            Companion companion = Companion;
            String str = sessionDescription2.description;
            p.g(str, "sdp.description");
            companion.jsonPut(jSONObject, "sdp", str);
            companion.jsonPut(jSONObject, "type", "offer");
            companion.jsonPut(jSONObject, TtmlNode.ATTR_ID, ApiUtil.INSTANCE.userAgent());
            RTCClientListener rTCClientListener = this.mListener;
            if (rTCClientListener != null) {
                String jSONObject2 = jSONObject.toString();
                p.g(jSONObject2, "json.toString()");
                rTCClientListener.sendMessage(this, jSONObject2);
            }
        } else if (type == SessionDescription.Type.ANSWER) {
            JSONObject jSONObject3 = new JSONObject();
            Companion companion2 = Companion;
            String str2 = sessionDescription2.description;
            p.g(str2, "sdp.description");
            companion2.jsonPut(jSONObject3, "sdp", str2);
            companion2.jsonPut(jSONObject3, "type", "answer");
            companion2.jsonPut(jSONObject3, TtmlNode.ATTR_ID, ApiUtil.INSTANCE.userAgent());
            RTCClientListener rTCClientListener2 = this.mListener;
            if (rTCClientListener2 != null) {
                String jSONObject4 = jSONObject3.toString();
                p.g(jSONObject4, "json.toString()");
                rTCClientListener2.sendMessage(this, jSONObject4);
            }
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        p.h(dataChannel, "dataChannel");
        Log.i("RTC", "Data channel");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        p.h(iceCandidate, "candidate");
        Log.i("RTC", "ICE candidate :" + this.userId + ' ' + iceCandidate);
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            String jSONObject = toJsonCandidate(iceCandidate).toString();
            p.g(jSONObject, "toJsonCandidate(candidate).toString()");
            rTCClientListener.sendMessage(this, jSONObject);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        p.h(iceCandidateArr, "candidates");
        PeerConnection peerConnection = this.peerConnection;
        if (peerConnection != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ICE candidate removed :");
            String name = peerConnection.iceConnectionState().name();
            Locale locale = Locale.getDefault();
            p.g(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            Log.i("RTC", sb2.toString());
        }
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            jSONArray.put(toJsonCandidate(iceCandidate));
        }
        JSONObject jSONObject = new JSONObject();
        Companion companion = Companion;
        companion.jsonPut(jSONObject, "type", "remove-candidates");
        companion.jsonPut(jSONObject, "candidates", jSONArray);
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            String jSONObject2 = jSONObject.toString();
            p.g(jSONObject2, "json.toString()");
            rTCClientListener.sendMessage(this, jSONObject2);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        p.h(iceConnectionState, "newState");
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            RTCActionType rTCActionType = RTCActionType.ICE_CONNECTION_STATE;
            String name = iceConnectionState.name();
            Locale locale = Locale.getDefault();
            p.g(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            rTCClientListener.onAction(this, rTCActionType, lowerCase);
        }
        RTCClientListener rTCClientListener2 = this.mListener;
        if (rTCClientListener2 != null) {
            rTCClientListener2.changeICEState(this, iceConnectionState);
        }
        Log.i("RTC", "ICE Change :" + this.userId + ' ' + iceConnectionState.name());
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            this.isConnected = true;
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            this.isConnected = false;
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z10) {
        Log.i("RTC", "ICE Connection Receiving ");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        p.h(iceGatheringState, "newState");
        Log.i("RTC", "ICE gathering change " + this.userId);
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            RTCActionType rTCActionType = RTCActionType.ICE_GATHERING_STATE;
            String name = iceGatheringState.name();
            Locale locale = Locale.getDefault();
            p.g(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            rTCClientListener.onAction(this, rTCActionType, lowerCase);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        p.h(mediaStream, "stream");
        Log.i("RTC", "remove stream");
        x.C(this.remoteStreams, new RTCClient$onRemoveStream$1(mediaStream));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        Log.i("RTC", "Negociation needed " + this.userId + ' ');
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            rTCClientListener.onAction(this, RTCActionType.NEGOTIATE, "");
        }
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        p.h(str, MRLog.PAYLOAD_KEY_ERROR);
        g9.a aVar = g9.a.f32826a;
        aVar.b("COLLAB set failed " + str + ' ' + this.userId, new Object[0]);
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            rTCClientListener.onError(this, "COLLAB set failed " + str + ' ' + this.userId);
        }
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
        if (this.isInitiator) {
            return;
        }
        PeerConnection peerConnection = this.peerConnection;
        p.e(peerConnection);
        if (peerConnection.getLocalDescription() == null) {
            PeerConnection peerConnection2 = this.peerConnection;
            p.e(peerConnection2);
            peerConnection2.createAnswer(this, createDefaultAnswerMediaConstraints());
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        p.h(signalingState, "newState");
        Log.i("RTC", "Signaling Change :" + this.userId + ' ' + signalingState.name());
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            RTCActionType rTCActionType = RTCActionType.SIGNALING_STATE;
            String name = signalingState.name();
            Locale locale = Locale.getDefault();
            p.g(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            rTCClientListener.onAction(this, rTCActionType, lowerCase);
        }
        RTCClientListener rTCClientListener2 = this.mListener;
        if (rTCClientListener2 != null) {
            rTCClientListener2.changeSignalingState(this, signalingState);
        }
    }

    public final void ping() {
        JSONObject jSONObject = new JSONObject();
        Companion.jsonPut(jSONObject, "type", "ping");
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            String jSONObject2 = jSONObject.toString();
            p.g(jSONObject2, "json.toString()");
            rTCClientListener.sendMessage(this, jSONObject2);
        }
    }

    public final void receiveMessage(String str) {
        p.h(str, "msg");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type");
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1412808770:
                        if (optString.equals("answer")) {
                            if (this.isInitiator) {
                                SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.fromCanonicalForm(optString), jSONObject.getString("sdp"));
                                if (jSONObject.has(TtmlNode.ATTR_ID)) {
                                    this.version = jSONObject.getString(TtmlNode.ATTR_ID);
                                }
                                PeerConnection peerConnection = this.peerConnection;
                                if (peerConnection != null) {
                                    peerConnection.setRemoteDescription(this, sessionDescription);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        break;
                    case -313011143:
                        if (optString.equals("remove-candidates")) {
                            JSONArray jSONArray = jSONObject.getJSONArray("candidates");
                            IceCandidate[] iceCandidateArr = new IceCandidate[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                p.g(jSONObject2, "candidateArray.getJSONObject(i)");
                                iceCandidateArr[i10] = toJavaCandidate(jSONObject2);
                            }
                            g9.a.g("remove candidate ");
                            PeerConnection peerConnection2 = this.peerConnection;
                            if (peerConnection2 != null) {
                                peerConnection2.removeIceCandidates(iceCandidateArr);
                                return;
                            }
                            return;
                        }
                        break;
                    case 98030:
                        if (optString.equals("bye")) {
                            close();
                            return;
                        }
                        break;
                    case 3441010:
                        if (optString.equals("ping")) {
                            pong();
                            return;
                        }
                        break;
                    case 3446776:
                        if (!optString.equals("pong")) {
                            break;
                        } else {
                            return;
                        }
                    case 105650780:
                        if (optString.equals("offer")) {
                            if (this.isInitiator) {
                                return;
                            } else {
                                SessionDescription sessionDescription2 = new SessionDescription(SessionDescription.Type.fromCanonicalForm(optString), jSONObject.getString("sdp"));
                                if (jSONObject.has(TtmlNode.ATTR_ID)) {
                                    this.version = jSONObject.getString(TtmlNode.ATTR_ID);
                                }
                                PeerConnection peerConnection3 = this.peerConnection;
                                if (peerConnection3 != null) {
                                    peerConnection3.setRemoteDescription(this, sessionDescription2);
                                    return;
                                }
                                return;
                            }
                        }
                        break;
                    case 508663171:
                        if (optString.equals("candidate")) {
                            PeerConnection peerConnection4 = this.peerConnection;
                            if (peerConnection4 != null) {
                                peerConnection4.addIceCandidate(toJavaCandidate(jSONObject));
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
            g9.a.f32826a.b("unknown json " + optString, new Object[0]);
        } catch (JSONException e10) {
            g9.a.f32826a.b("json invalid failed " + e10.getLocalizedMessage(), new Object[0]);
        }
    }

    public final void sendPeerAccept() {
        JSONObject jSONObject = new JSONObject();
        Companion.jsonPut(jSONObject, "type", "peer_accept");
        RTCClientListener rTCClientListener = this.mListener;
        if (rTCClientListener != null) {
            String jSONObject2 = jSONObject.toString();
            p.g(jSONObject2, "json.toString()");
            rTCClientListener.sendMessage(this, jSONObject2);
        }
    }
}
