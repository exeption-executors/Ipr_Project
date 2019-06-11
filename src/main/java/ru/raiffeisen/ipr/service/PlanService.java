package ru.raiffeisen.ipr.service;

import ru.raiffeisen.ipr.entity.Plan;

import java.sql.Date;

public interface PlanService {
    Plan savePlan (Plan plan);
    void deletePlanById(Long id);
    void createSection(Long plan_id, Date section_date_end, String section_description, String priority);
    void deleteSectionById(Long id);
    void updateSection(Date section_date_end, String section_description, String priority, Long id);
    void createPoint(Long section_id, boolean point_is_done, String point_description);
    void deletePoint(Long id);
    void updatePoint(boolean point_is_done, String point_description, Long id);
}