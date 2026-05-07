package com.nj.play.docker.candidateservice.util;


import com.nj.play.docker.candidateservice.dto.CandidateDetailsDto;
import com.nj.play.docker.candidateservice.dto.CandidateDto;
import com.nj.play.docker.candidateservice.entity.Candidate;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {

    public static CandidateDto toDto(Candidate candidate){
        CandidateDto dto = new CandidateDto();
        BeanUtils.copyProperties(candidate, dto);
        dto.setHostName(AppUtil.getHostname());
        return dto;
    }

    public static CandidateDetailsDto toDetailsDto(Candidate candidate){
        CandidateDetailsDto dto = new CandidateDetailsDto();
        BeanUtils.copyProperties(candidate, dto);
        dto.setHostName(AppUtil.getHostname());
        return dto;
    }

    public static Candidate toEntity(CandidateDto dto){
        Candidate entity = new Candidate();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

}
