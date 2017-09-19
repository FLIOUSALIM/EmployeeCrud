--
-- Database :  `EmployeeCRUD`
--

--
-- `Employee` table structure
--

CREATE TABLE `Employee` (
  `matriculeRegistration` varchar(25) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE `Employee`
  ADD PRIMARY KEY (`matriculeRegistration`);