package com.serenegiant.janus.request;
/*
 * JanusRTCAndroid
 * Video chat sample app using videoroom plugin on janus-gateway server and WebRTC.
 *
 * Copyright (c) 2018 saki t_saki@serenegiant.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
*/

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.serenegiant.janus.Room;
import com.serenegiant.janus.TransactionManager;

import org.webrtc.IceCandidate;

import java.math.BigInteger;

public class Trickle {
	@NonNull
	public final String janus;
	@NonNull
	public final String transaction;
	@NonNull
	public final BigInteger session_id;
	@NonNull
	public final BigInteger handle_id;
	@NonNull
	public final Candidate candidate;

	public Trickle(@NonNull final BigInteger session_id,
		@NonNull final BigInteger handle_id,
		@NonNull final Candidate candidate,
		@Nullable final TransactionManager.TransactionCallback callback) {

		this.janus = "trickle";
		this.transaction = TransactionManager.get(12, callback);
		this.session_id = session_id;
		this.handle_id = handle_id;
		this.candidate = candidate;
	}
	
	public Trickle(@NonNull final Room room,
	   @NonNull final Candidate candidate,
		@Nullable final TransactionManager.TransactionCallback callback) {
	   
	   this(room.sessionId, room.pluginId, candidate, callback);
	}
	
	public Trickle(@NonNull final Room room,
		@NonNull final IceCandidate candidate,
		@Nullable final TransactionManager.TransactionCallback callback) {
		

		this(room.sessionId, room.pluginId,
			new Candidate(candidate.sdpMLineIndex,
				candidate.sdpMid, candidate.sdp),
			callback);
	}

	public static class Candidate {
		public final int sdpMLineIndex;
		public final String sdpMid;
		public final String candidate;
		
		public Candidate(final int sdpMLineIndex, final String sdpMid,
			final String candidate) {

			this.sdpMLineIndex = sdpMLineIndex;
			this.sdpMid = sdpMid;
			this.candidate = candidate;
		}
		
		@Override
		public String toString() {
			return "Candidate{" +
				"sdpMLineIndex=" + sdpMLineIndex +
				", sdpMid='" + sdpMid + '\'' +
				", candidate='" + candidate + '\'' +
				'}';
		}
	}

	@Override
	public String toString() {
		return "Trickle{" +
			"janus='" + janus + '\'' +
			", transaction='" + transaction + '\'' +
			", session_id=" + session_id +
			", candidate=" + candidate +
			'}';
	}
}
