package com.dnd.sixth.lmsservice.data.repository.subject.datasource.remote

import com.dnd.sixth.lmsservice.data.model.generalclass.GeneralSubjectModel
import com.dnd.sixth.lmsservice.data.model.subject.SubjectModel
import com.dnd.sixth.lmsservice.data.repository.emitter.RemoteErrorEmitter
import com.dnd.sixth.lmsservice.domain.entity.GeneralSubjectEntity
import com.dnd.sixth.lmsservice.domain.entity.SubjectEntity

interface SubjectRemoteDataSource {
    suspend fun createSubject(remoteErrorEmitter: RemoteErrorEmitter, subjectEntity: SubjectEntity): SubjectModel?
    suspend fun getGeneralClassList(remoteErrorEmitter: RemoteErrorEmitter, uid: Int): List<GeneralSubjectModel>?
}