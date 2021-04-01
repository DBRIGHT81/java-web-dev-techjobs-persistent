## Part 1: Test it with SQL
SELECT * FROM tech_jobs.job;

## Part 2: Test it with SQL
SELECT * FROM tech_jobs.employer
WHERE location = 'St. Louis';

## Part 3: Test it with SQL
DROP TABLE `tech_jobs`.`job`;

## Part 4: Test it with SQL
SELECT name, description FROM tech_jobs.skill
INNER JOIN tech_jobs.job_skills ON tech_jobs.skill.id = tech_jobs.job_skills.skills_id;