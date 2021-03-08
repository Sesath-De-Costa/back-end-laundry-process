package lk.washhub.washapp.web.business.custom.impl;

import lk.washhub.washapp.web.business.custom.StageBO;
import lk.washhub.washapp.web.business.util.EntityDTOMapper;
import lk.washhub.washapp.web.dao.StageDAO;
import lk.washhub.washapp.web.dto.StageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-03
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Service
@Transactional
public class StageBOImpl implements StageBO {

    @Autowired
    private StageDAO stageDAO;

    @Autowired
    private EntityDTOMapper mapper;

    public StageBOImpl() {
    }

    @Override
    public void saveStage(StageDTO stageDTO) throws Exception {
        stageDAO.save(mapper.getStage(stageDTO));
    }

    @Override
    public void updateStage(StageDTO stageDTO) throws Exception {
        stageDAO.save(mapper.getStage(stageDTO));
    }

    @Override
    public void deleteStage(int key) throws Exception {
        stageDAO.deleteById(key);
    }

    @Override
    public StageDTO getStage(int key) throws Exception {
        return mapper.getStageDTO(stageDAO.getOne(key));
    }

    @Override
    public List<StageDTO> getAllStage() throws Exception {
        return mapper.getAllStageDTO(stageDAO.findAll());
    }
}
